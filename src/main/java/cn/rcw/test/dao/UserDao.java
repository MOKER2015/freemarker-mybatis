package cn.rcw.test.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.rcw.comm.dao.MyBatisBaseMapper;
import cn.rcw.test.entity.User;

public interface UserDao extends MyBatisBaseMapper<User, java.lang.Integer> {
	
	//增加用户
	public int addUser(User user);
	//删除用户
	public int delUser(@Param("id") int id);
	//修改用户
	public int upUser(User user);
	//根据id查找
	public User getById(@Param("id") int id);
	//保存用户，可以使用继承 的
	public int insert(User user);
	//查找用户
	public List<User> selectUser(User user);
}
