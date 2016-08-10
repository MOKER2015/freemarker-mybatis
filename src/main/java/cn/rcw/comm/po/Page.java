package cn.rcw.comm.po;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;

/**
 * 分页类
 * @author zhuyg
 * @version 2015-06-23
 * @param <T>
 */
public class Page<T>{
	
	private int page = 1; // 当前页码
	private int rows = -1; // 页面大小，设置为“-1”表示不进行分页（分页无效）	
	
	private String sort = "";  //排序的字段
	private String order = ""; //排序方式：asc、desc

	private Integer total = 0;// 总记录数，设置为“-1”表示不查询总数
	private List<T> list = new ArrayList<T>();
	
	public Page() {}
	
	/**
	 * 构造方法
	 * @param pageNo 当前页码
	 * @param pageSize 分页大小
	 */
	public Page(int rows) {
		this.rows = rows;
	}
	
	/**
	 * 获取  FirstResult
	 */
	public int getFirstResult(){
		int firstResult = (getPage() - 1) * getRows();
		if (firstResult >= getTotal()) {
			firstResult = 0;
		}
		return firstResult;
	}
	/**
	 * 获取  MaxResults
	 */
	public int getMaxResults(){
		return getRows();
	}
	
	public String toString(){
		return "{\"total\":" + total + ",\"rows\":" + JSONArray.toJSONString(list) + "}";
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<T> getList() {
		return list;
	}

	public Page<T> setList(List<T> list) {
		this.list = list;
		return this;
	}
	
}
