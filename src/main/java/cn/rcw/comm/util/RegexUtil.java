package cn.rcw.comm.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

	/**
	 * 检查是否为正确的手机号码
	 * @param mobile		手机号码
	 * @return
	 */
	public static boolean isMobile(String mobile){
		return regex(mobileRegex(), mobile);
	}
	
	/**
	 * 检查手机的正则表达式
	 * @return
	 */
	private static String mobileRegex(){
		return "^(0)?(13)[0-9][0-9]{8}$|^(0)?(14)[5,7][0-9]{8}$|^(0)?(15)[0-3][0-9]{8}$|^(0)?(15)[5-9][0-9]{8}$|^(0)?(17)[6-7][0-9]{8}$|^(0)?(18)[0-9][0-9]{8}$";
	}
	
	/**
	 * 使用正则表达式来检查指定内容
	 * @param regex		正则表达式
	 * @param str		待检查的内容
	 * @return
	 */
	private static boolean regex(String regex, String str){
		if(CommUtil.isEmpty(regex) || CommUtil.isEmpty(str)) return false;
		Pattern p = Pattern.compile(regex);
		return p.matcher(str).matches();
	}
	
	/**
	 * 使用正则表达式来检查指定内容替换变色
	 * @param keyword		关键字
	 * @param str		待检查的内容
	 * @return
	 */
	public static String regReplaces(String str, String keyword){
		Pattern p = Pattern.compile(keyword,Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(str);
		StringBuffer sb = new StringBuffer();  
        while (m.find())  
        {  
            m.appendReplacement(sb, "<font color='#ff0000'>" + m.group() + "</font>");  
        }  
        m.appendTail(sb);  
        return sb.toString();
	}
}
