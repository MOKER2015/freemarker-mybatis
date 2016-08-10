package cn.rcw.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.rcw.comm.po.Page;
import cn.rcw.test.dao.UserDao;
import cn.rcw.test.entity.User;

@Component 
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	//显示所有用户
	public Page<User> showAllUser(User user){
		System.out.println("++++++++++++++++++ 点 2 ++++++++++++++++++++");
		return   user.setList(userDao.selectUser(user));    
	}

	//增加用户
	public int addUser(User user){
		return this.userDao.addUser(user);
	}
	
	//删除用户
	public int delUser(int id){
		return this.userDao.delUser(id);
	}
	
	//修改用户
	public int upUser(User user){
		return this.userDao.upUser(user);
	}
	
	public User getById(Integer id){
		return this.userDao.getById(id);
	}
	
	public int insertOrUpdate(User user){
		return this.userDao.insert(user);
	}
	
	public int deleteByIds(List<Integer> ids){
		return this.userDao.deleteByIds(ids);
	}
	
	public Page<User> selectUser(User user){
		return user.setList(userDao.selectUser(user));
	}
}
