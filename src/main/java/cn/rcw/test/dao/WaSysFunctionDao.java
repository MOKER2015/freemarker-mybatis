package cn.rcw.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.rcw.comm.dao.MyBatisBaseMapper;
import cn.rcw.test.entity.WaSysFunction;


public interface WaSysFunctionDao extends MyBatisBaseMapper<WaSysFunction, java.lang.Integer>{

	 public  List<WaSysFunction> getAllByPrarentId(@Param("type") String type,@Param("prarentId") Integer prarentId);
	 
	 public  List<WaSysFunction> getByPrarentId(@Param("username") String username,@Param("type") String type,@Param("prarentId") Integer prarentId);
	 
	 public  List<WaSysFunction> getAllsysFunc(@Param("funcId") Integer funcId,@Param("available") Integer available);
	 
	 public  List<WaSysFunction> getMenuFunc(@Param("funcId") Integer funcId,@Param("available") Integer available);
	 
	 public  List<WaSysFunction> getAllroleFunc(@Param("roleid") Integer funcId,@Param("available") Integer available);
	 
	 public List<String> findPermissions(String username);
	 
	 public List<String> findAllPermissions();
}