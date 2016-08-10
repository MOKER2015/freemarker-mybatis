package cn.rcw.test.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.rcw.comm.config.Global;
import cn.rcw.comm.po.CallBack;
import cn.rcw.comm.po.Page;
import cn.rcw.comm.util.CommUtil;
import cn.rcw.test.entity.User;
import cn.rcw.test.service.UserService;

@Controller
public class UserController {
	
	@Autowired
    private UserService userService;
	
	@RequestMapping("/index_user")
	public String showUserInfo(Model mod){
		System.out.println("++++++++++++++++++ 点 1 ++++++++++++++++++++");
		return "index/showUser";
	}

	@ResponseBody
	@RequestMapping("/index_info")
	public String showAllUser(){
		User user=new User();
		user.setRows(15);
		Page<User> page=userService.showAllUser(user);
		String str = CommUtil.isNotEmpty(page)?page.toString():"";
		return str;
	}
	
	//增加用户
	@RequestMapping("/addUser")
	public String addUser(){
		System.out.println("+++++++++*1******************");
		return "index/upUser";
	}
	//修改用户
	@RequestMapping("/upUser")
	public String upUser(Integer id, Model model){
		System.out.println("+++++++++*2******************");
		User user=this.userService.getById(id);
		model.addAttribute("upUser", user);
		return "index/upUser";
	}
		
	//保存用户信息
	@ResponseBody
	@RequestMapping("/saveUser")
	public String saveUser(HttpServletRequest request,User user) {
		System.out.println("+++++++++*3******************");
		System.out.println(user.getName()+" "+user.getContent());
		int result;
		if(user.getId()!=null){
			result=userService.upUser(user);
		}else{
		    result = userService.insertOrUpdate(user);
		}
		return new CallBack(result).toString();
	}	
	
	//删除用户信息
	@ResponseBody
	@RequestMapping("/delUser")
	public String delUser(HttpServletRequest request,@RequestParam(value = "ids[]") List<Integer> ids) {
		System.out.println("+++++++++*4******************");
		Iterator<Integer> it=ids.iterator();
		while (it.hasNext())
		  {
		   int i = (Integer) it.next();
		   System.out.println(i);
		  }
		
		int result = userService.deleteByIds(ids);
		return new CallBack(result).toString();
	}
	
	//查询用户信息
	@ResponseBody
	@RequestMapping("/selectUser")
	public String selectUser(User user){
		System.out.println("+++++++++*6******************");
		System.out.println(user.getId());
		Page<User> page=this.userService.selectUser(user);
		System.out.println(page.getFirstResult());
		return CommUtil.isNotEmpty(page)?page.toString():"";
	} 
/*	@RequestMapping("/showUser")
	public String showAllUser(Model mod){
		System.out.println("++++++++++++++++++ 点 1 ++++++++++++++++++++");
		List<User> userList=this.userService.showAllUser();
    	mod.addAllAttributes(userList);
		return "index/showUser";
	}*/
/*	
	@RequestMapping("/index")
	public ModelAndView showAllUser() {
		System.out.println("++++++++++++++++++ 点 1 ++++++++++++++++++++");
		List<User> userList = this.userService.showAllUser();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userList", userList);
		ModelAndView mod = new ModelAndView("index/showUser", map);
		return mod;
	}*/
	
	
	
/*	@RequestMapping("/index")
	@ResponseBody
	public String showAllUser() {
		System.out.println("++++++++++++++++++ 点 1 ++++++++++++++++++++");
		List user = this.userService.showAllUser();
		return user.toString();
	}*/

	/*
	 * public String showAllUser(Model mod){
	 * System.out.println("++++++++++++++++++ 点 1 ++++++++++++++++++++");
	 * List<User> userList=this.userService.showAllUser(); Map<String,Object>
	 * map=new HashMap<String,Object>(); map.put("userList",userList);
	 * mod.addAllAttributes(map); return "index/showUser"; }
	 */

	/*
	 * @ResponseBody public Map showAllUser(){
	 * System.out.println("++++++++++++++++++ 点 1 ++++++++++++++++++++");
	 * List<User> userList=this.userService.showAllUser();
	 * 
	 * Map map = new HashMap<String, Object>(); map.put("userList",userList);
	 * 
	 * return map; }
	 */
	 

	
/*	//删除用户
	@ResponseBody
	@RequestMapping("/delUser")
	public String delUser(HttpServletRequest request,User user){
		int id=user.getId();
		int res=this.userService.delUser(id);
		return "index/showUser";
	}
	
	*/
}
