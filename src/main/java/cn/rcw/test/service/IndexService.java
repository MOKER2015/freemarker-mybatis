package cn.rcw.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.rcw.comm.config.Global;
import cn.rcw.test.dao.WaSysFunctionDao;
import cn.rcw.test.entity.WaSysFunction;
/**
 * @author zhuyg
 * @date 2015-8-18
 * @version 1.0
 */
@Component
public class IndexService {

	@Autowired
	private WaSysFunctionDao waSysFunctionDao;
	
	 public List<WaSysFunction> getByPrarentId(String username, String type, Integer prarentId){
		 return username.equals("admin") ? waSysFunctionDao.getAllByPrarentId(type, prarentId) 
				 : waSysFunctionDao.getByPrarentId(username, type, prarentId);
	 }
	 
	 public List<WaSysFunction> getFunction(String username, Integer prarentId){
		 
		 List<WaSysFunction> waSysFunctions = username.equals("admin") ? waSysFunctionDao.getAllByPrarentId(Global.FUNC_TYPE_FUNC, prarentId) 
				 : waSysFunctionDao.getByPrarentId(username, Global.FUNC_TYPE_FUNC, prarentId);
		 
		 for(WaSysFunction waSysFunction : waSysFunctions){
			 List<WaSysFunction> functionChildrens = username.equals("admin") ? waSysFunctionDao.getAllByPrarentId(Global.FUNC_TYPE_FUNC, waSysFunction.getId()) 
					 : waSysFunctionDao.getByPrarentId(username, Global.FUNC_TYPE_FUNC, waSysFunction.getId());	 
			 waSysFunction.setFunctionLists(functionChildrens);
		 }
		 
		 return waSysFunctions;
	 }
}
