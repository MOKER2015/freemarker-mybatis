package cn.rcw.test.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;

import cn.rcw.comm.config.Global;
import cn.rcw.test.entity.WaSysFunction;
import cn.rcw.test.service.IndexService;

@Controller
public class IndexController {
	@Autowired
	private IndexService indexService;  
	

	@RequestMapping("/index")
	public String index(Model model, HttpSession session) {
		String username = "admin";
		List<WaSysFunction> ssFunctions = indexService.getByPrarentId(username, Global.FUNC_TYPE_MENU, 1);

		model.addAttribute("menus", ssFunctions);
		model.addAttribute("username", username);
		return "index/index";
	}
	
	
/*	@RequestMapping("/index")
	public String index(Model model, HttpSession session) {
		return "index/index";
	}*/
	
	@ResponseBody
	@RequestMapping("{id}/getFunction")
	public String getFunction(@PathVariable Integer id, HttpSession session) {
		String username ="admin";
		return JSONArray.toJSONString(indexService.getFunction(username, id));
	}
	
}
