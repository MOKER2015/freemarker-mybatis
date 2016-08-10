package cn.rcw.comm.util;

import java.io.IOException;
import java.util.Properties;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
/**
 * 读取properties文件
 * @author slj
 * @date 2015-06-17
 * @version 1.0
 */
public class PropertiesUtil {

	public static Properties props;
	
	static{
		init();
	}
	
	public static void init(){
		Resource resource = new ClassPathResource("/global.properties");
		try {
			props = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getStringProperties(String name){
		return props ==null ? null : props.getProperty(name);
	}
	
	public static void main(String[] args) {
		System.out.println(PropertiesUtil.getStringProperties("jdbc.type"));
	}
}
