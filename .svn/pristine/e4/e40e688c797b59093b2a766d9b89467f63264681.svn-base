package cn.rcw.comm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.rcw.comm.po.Page;

/**
 * @author zhuyg
 * @date 2015-6-19
 * @version 1.0
 */
public interface MyBatisBaseMapper<E,PK> {
	
	  /**
	  * 功能描述：查找接口
	  * @param key
	  * @return
	  *
	  */
	  public  E getById(@Param("id") PK id);
	  
	  /**
	  * 功能描述：查找接口
	  * @param key
	  * @return
	  *
	  */
	  public  List<E> query(@Param("id") PK id);
	
	  /**
	   * 功能描述：标准的查询接口
	   * @param entity
	   * @return
	   * List<E>
	   *
	   */
	  public List<E> getPage(Page<E> vo);
	  
	  /**
	   * 
	   * 功能描述：记录新增
	   * @param entity
	   * @return
	   */
	  public int insert(E entity);
	  
	  /**
	   * 
	   * 功能描述：记录批量新增
	   * @param entitys
	   * @return
	   */
	  public int insertBatch(List<E> entitys);
	  
	  /**
	   * 功能描述：记录更新
	   * @param entity
	   * @return
	   * @
	   */
	  public  int update(E entity);
	  
	  /**
	   * 功能描述：记录更新
	   * @param entity
	   * @return
	   * @
	   */
	  public  int updateById(@Param("id") PK id);
	  
	  
	  /**
	   * 功能描述：记录批量更新
	   * @param entitys
	   * @return
	   * @
	   */
	  public  int updateBatch(List<PK> entitys);
	  
	  /**
	   * 功能描述：记录删除
	   * @param key
	   * @return
	   * @
	   */
	  public  int delete(@Param("id") PK id);
	  
	  /**
	   * 功能描述：记录删除
	   * @param keys
	   * @return
	   * @
	   */
	  public  int deleteByIds(@Param("list") List<PK> keys);

}
