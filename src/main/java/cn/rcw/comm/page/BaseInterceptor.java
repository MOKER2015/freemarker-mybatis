package cn.rcw.comm.page;

import java.util.Properties;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.plugin.Interceptor;

import cn.rcw.comm.po.Page;
import cn.rcw.comm.page.dialect.Dialect;
import cn.rcw.comm.page.dialect.db.DB2Dialect;
import cn.rcw.comm.page.dialect.db.DerbyDialect;
import cn.rcw.comm.page.dialect.db.H2Dialect;
import cn.rcw.comm.page.dialect.db.HSQLDialect;
import cn.rcw.comm.page.dialect.db.MySQLDialect;
import cn.rcw.comm.page.dialect.db.OracleDialect;
import cn.rcw.comm.page.dialect.db.PostgreSQLDialect;
import cn.rcw.comm.page.dialect.db.SQLServer2005Dialect;
import cn.rcw.comm.page.dialect.db.SybaseDialect;
import cn.rcw.comm.util.PropertiesUtil;
import cn.rcw.comm.util.ReflectionUtil;

/**
 * Mybatis分页拦截器基类
 * 
 * @author zhuyg
 * @date 2015-6-23
 * @version 1.0
 */
public abstract class BaseInterceptor implements Interceptor {

	protected static final String PAGE = "vo";

	protected static final String DELEGATE = "delegate";

	protected static final String MAPPED_STATEMENT = "mappedStatement";

	protected static Log log = LogFactory.getLog(BaseInterceptor.class);

	protected Dialect DIALECT;

	// /**
	// * 拦截的ID，在mapper中的id，可以匹配正则
	// */
	// protected String _SQL_PATTERN = "";

	/**
	 * 对参数进行转换和检查
	 * 
	 * @param parameterObject
	 *            参数对象
	 * @param page
	 *            分页对象
	 * @return 分页对象
	 * @throws NoSuchFieldException
	 *             无法找到参数
	 */
	@SuppressWarnings("unchecked")
	protected static Page<Object> convertParameter(Object parameterObject) {

		if (parameterObject instanceof Page) {
			return (Page<Object>) parameterObject;
		} else {	
			log.debug("= Object　is　not extends page=");
			return null;
		}

	}

	/**
	 * 设置属性，支持自定义方言类和制定数据库的方式 <code>dialectClass</code>,自定义方言类。可以不配置这项
	 * <ode>dbms</ode> 数据库类型，插件支持的数据库 <code>sqlPattern</code> 需要拦截的SQL ID
	 * 
	 * @param p
	 *            属性
	 */
	protected void initProperties(Properties p) {
		Dialect dialect = null;
		String dbType = PropertiesUtil.getStringProperties("jdbc.type");
		dbType = dbType == null ? "mysql" : dbType;
		if ("db2".equals(dbType)) {
			dialect = new DB2Dialect();
		} else if ("derby".equals(dbType)) {
			dialect = new DerbyDialect();
		} else if ("h2".equals(dbType)) {
			dialect = new H2Dialect();
		} else if ("hsql".equals(dbType)) {
			dialect = new HSQLDialect();
		} else if ("mysql".equals(dbType)) {
			dialect = new MySQLDialect();
		} else if ("oracle".equals(dbType)) {
			dialect = new OracleDialect();
		} else if ("postgre".equals(dbType)) {
			dialect = new PostgreSQLDialect();
		} else if ("mssql".equals(dbType) || "sqlserver".equals(dbType)) {
			dialect = new SQLServer2005Dialect();
		} else if ("sybase".equals(dbType)) {
			dialect = new SybaseDialect();
		}
		if (dialect == null) {
			throw new RuntimeException("mybatis dialect error.");
		}
		DIALECT = dialect;
	}
}
