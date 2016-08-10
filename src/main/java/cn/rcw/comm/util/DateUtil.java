package cn.rcw.comm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 日期计算工具
 * @author dcx
 * @date 2015-07-23
 * @version 1.0
 */
public class DateUtil {
	

	/**
	 * 把当前日期转换为字符串
	 * 
	 * @param format
	 *            "yyyy-MM-dd HH:mm:ss:SS"
	 * @return
	 */
	public static String getNowTimeStr() {
		return getNowTimeStr("yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * 获取当前时间
	 * @param parten
	 * @return
	 */
	public static String nowStr(String parten){ 
		 Date dt = new Date();  
		 SimpleDateFormat sdf = new SimpleDateFormat(parten);  
		 return sdf.format(dt);   
	}

	/**
	 * 把当前日期转换为字符串
	 * 
	 * @param format
	 *            "yyyy-MM-dd HH:mm:ss:SS"
	 * @return
	 */
	public static String getNowTimeStr(String format) {
		return getDateStr(Calendar.getInstance(), format);
	}

	/**
	 * 把日期转换为字符串
	 * 
	 * @param cal
	 * @param format
	 *            "yyyy-MM-dd HH:mm:ss:SS"
	 * @return
	 */
	public static String getDateStr(Calendar cal, String format) {
		if (cal == null)
			return "";
		SimpleDateFormat sf = new SimpleDateFormat(format);
		return sf.format(cal.getTime());
	}

	/**
	 * 日期格式转换
	 * 
	 * @param date
	 * @param format
	 *            "yyyy-MM-dd HH:mm:ss:SSS"
	 * @param toFormat
	 *            "yyyy-MM-dd HH:mm:ss"
	 * @return
	 */
	public static String formatType(String date, String format, String toFormat) {
		SimpleDateFormat sf = new SimpleDateFormat(format);
		Date dates;
		try {
			dates = sf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}

		sf = new SimpleDateFormat(toFormat);
		return sf.format(dates);
	}

	public static String getDateStr(Date date, String format) {
		if (date == null)
			return "";
		SimpleDateFormat sf = new SimpleDateFormat(format);
		return sf.format(date);
	}

	/**
	 * 字符串转化为日期
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Calendar getCalByStr(String str, String format) {
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat sf = new SimpleDateFormat(format);
			calendar.setTime(sf.parse(str));
			return calendar;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 取时间日期,日期以下时间清零
	 * 
	 * @param cal
	 * @return
	 */
	public static Calendar getCalCleanTime(Calendar cal) {
		try {
			String str = DateUtil.getDateStr(cal, "yyyyMMdd");
			Calendar newCal = DateUtil.getCalByStr(str, "yyyyMMdd");
			return newCal;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 取当月第一天
	 * 
	 * @param cal
	 * @return
	 */
	public static Calendar getMonthFirstDate(Calendar cal) {
		Calendar firCal = (Calendar) cal.clone();
		firCal.set(Calendar.DAY_OF_MONTH, 1);
		return firCal;
	}

	/**
	 * 取当月最后一天
	 * 
	 * @param cal
	 * @return
	 */
	public static Calendar getMonthLastDate(Calendar cal) {
		Calendar lastCal = (Calendar) cal.clone();
		lastCal.add(Calendar.MONTH, 1);
		lastCal.set(Calendar.DAY_OF_MONTH, 1);
		lastCal.add(Calendar.DAY_OF_MONTH, -1);
		return lastCal;

	}

	/**
	 * 取当月第一天
	 * 
	 * @param cal
	 * @return
	 */
	public static String getMonthFirstDate() {
		return getDateStr(getMonthFirstDate(Calendar.getInstance()),
				"yyyy-MM-dd") + " 00:00:00";
	}

	/**
	 * 取当月最后一天
	 * 
	 * @param cal
	 * @return
	 */
	public static String getMonthLastDate() {
		return getDateStr(getMonthLastDate(Calendar.getInstance()),
				"yyyy-MM-dd") + " 23:59:59";
	}

	/**
	 * 取当前月份(yyyyMM)
	 * 
	 * @return
	 */
	public static String getNowMonth() {
		return DateUtil.getDateStr(Calendar.getInstance(), "yyyyMM");
	}

	/**
	 * 取上月份(yyyyMM)
	 * 
	 * @return
	 */
	public static String getLastMonth() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -1);
		return DateUtil.getDateStr(cal, "yyyyMM");
	}

	/**
	 * 取当前日期(yyyyMMdd)
	 * 
	 * @return
	 */
	public static String getNowDate() {
		return DateUtil.getDateStr(Calendar.getInstance(), "yyyy-MM-dd");
	}

	/**
	 * 取周的第一天
	 * 
	 * @param cal
	 * @return
	 */
	public static Calendar getWeekFirstDay(Calendar cal) {
		Calendar fDay = (Calendar) cal.clone();
		fDay.setFirstDayOfWeek(Calendar.MONDAY);
		fDay.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return fDay;
	}

	/**
	 * 取当周最后一天
	 * 
	 * @param cal
	 * @return
	 */
	public static Calendar getWeekLastDay(Calendar cal) {
		Calendar fDay = (Calendar) cal.clone();
		fDay.setFirstDayOfWeek(Calendar.MONDAY);
		fDay.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		return fDay;
	}

	/**
	 * 取 yyyyMM月有多少天
	 */
	public static int getDays(String smonth) {
		Calendar c = DateUtil.getCalByStr(smonth, "yyyyMM");
		return c.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 取 yyyyMM月后diff月的yyyyMM月
	 */
	public static String getFolSmonth(String smonth, int diff) {
		Date date;
		try {
			date = new SimpleDateFormat("yyyyMM").parse(smonth);
		} catch (ParseException e) {
			return smonth;
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, diff);
		return DateUtil.getDateStr(c, "yyyyMM");
	}

	/**
	 * 小时列表
	 * */
	public static List<String> getHoursList() {
		List<String> hoursList = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			hoursList.add("0" + i);
		}
		for (int i = 10; i < 24; i++) {
			hoursList.add(i + "");
		}
		return hoursList;
	}

	/**
	 * 分列表
	 * */
	public static List<String> getMinutesList() {
		List<String> hoursList = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			hoursList.add("0" + i);
		}
		for (int i = 10; i < 60; i++) {
			hoursList.add(i + "");
		}
		return hoursList;
	}

	/**
	 * 取月列表
	 * 
	 * @return
	 */
	public static List<String> getMonthList() {
		List<String> list = new ArrayList<String>();
		for (int i = 1; i < 10; i++) {
			list.add("0" + i);
		}
		for (int i = 10; i <= 12; i++) {
			list.add(i + "");
		}
		return list;
	}

	/**
	 * 取年列表
	 * 
	 * @return
	 */
	public static List<String> getYearList(int befort, int after) {
		List<String> list = new ArrayList<String>();
		Integer nowYear = Integer.parseInt(DateUtil.getDateStr(
				Calendar.getInstance(), "yyyy"));
		for (int i = nowYear - befort; i <= nowYear + after; i++) {
			list.add(String.valueOf(i));
		}
		return list;
	}

	/**
	 * 取当年
	 * 
	 * @return
	 */
	public static String getNowYear() {
		return DateUtil.getDateStr(Calendar.getInstance(), "yyyy");
	}

	/**
	 * 判断结出时间是否符合规则
	 * 
	 * @param time
	 * @param rule
	 *            规则，与quartz类似，但只支持, - *三和符号 用空格分隔,从秒开始查测，后面可以为空，空代表不限制. Seconds
	 *            0-59 , - * Minutes 0-59 , - * Hours 0-23 , - * Day of month
	 *            1-31 , - * Month 1-12 , - * Day of week 1-7 , - * Year
	 *            1970-2099 , - *
	 * @return
	 */
	public static boolean checkTimeRule(Calendar time, String rule) {
		if (time == null)
			return false;
		if (rule == null || rule.equals(""))
			return true;

		String[] rules = rule.split(" ");
		// 秒
		if (rules.length > 0) {
			if (!checkOnePartTimeRule(time.get(Calendar.SECOND), rules[0]))
				return false;
		}
		// 分
		if (rules.length > 1) {
			if (!checkOnePartTimeRule(time.get(Calendar.MINUTE), rules[1]))
				return false;
		}
		// 时
		if (rules.length > 2) {
			if (!checkOnePartTimeRule(time.get(Calendar.HOUR_OF_DAY), rules[2]))
				return false;
		}
		// 日
		if (rules.length > 3) {
			if (!checkOnePartTimeRule(time.get(Calendar.DAY_OF_MONTH), rules[3]))
				return false;
		}
		// 月
		if (rules.length > 4) {
			if (!checkOnePartTimeRule(time.get(Calendar.MONTH) + 1, rules[4]))
				return false;
		}
		// 星期
		if (rules.length > 5) {
			if (!checkOnePartTimeRule((time.get(Calendar.DAY_OF_WEEK) == 1 ? 7
					: (time.get(Calendar.DAY_OF_WEEK) - 1)), rules[5]))
				return false;
		}
		// 年
		if (rules.length > 6) {
			if (!checkOnePartTimeRule(time.get(Calendar.YEAR), rules[6]))
				return false;
		}

		return true;
	}

	/**
	 * 检查部分时间规则(例：2,5 5-9 * *-9 12-*)
	 * 
	 * @param partTime
	 *            时间
	 * @param partRule
	 *            部分规则
	 * @return
	 */
	private static boolean checkOnePartTimeRule(int partTime, String partRule) {
		String[] rules = partRule.split(",");
		for (String rule : rules) {
			if (rule.equals("*")) {
				return true;
			}
			if (rule.contains("-")) {
				String[] rule_s = rule.split("-");
				try {
					if (rule_s[0].equals("*") && rule_s[1].equals("*")) {
						return true;
					} else if (rule_s[0].equals("*")) {
						if (partTime <= Integer.parseInt(rule_s[1])) {
							return true;
						}
					} else if (rule_s[1].equals("*")) {
						if (Integer.parseInt(rule_s[0]) <= partTime) {
							return true;
						}
					} else if (Integer.parseInt(rule_s[0]) <= partTime
							&& partTime <= Integer.parseInt(rule_s[1])) {
						return true;
					}
				} catch (Exception e) {

				}
			} else {
				try {
					if (Integer.parseInt(rule) == partTime) {
						return true;
					}
				} catch (Exception e) {

				}
			}
		}

		return false;
	}

	/**
	 * 
	 * @param time
	 * @return
	 */
	public static Calendar clearTime(Calendar time) {
		if (time == null)
			return null;
		return DateUtil.getCalByStr(DateUtil.getDateStr(time, "yyyy-MM-dd"),
				"yyyy-MM-dd");
	}

	/**
	 * 按年取周列表
	 * 
	 * @return
	 */
	public static List<String> getWeekList(int befort, int after) {
		List<String> list = new ArrayList<String>();
		Integer nowYear = Integer.parseInt(DateUtil.getDateStr(
				Calendar.getInstance(), "yyyy"));
		for (int i = nowYear - befort; i <= nowYear + after; i++) {
			list.add(String.valueOf(i));
		}
		return list;
	}

	public static boolean isDate(String date, String format) {
		SimpleDateFormat simpleFormat = new SimpleDateFormat(format);
		try {
			simpleFormat.parse(date);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

	/**
	 * 字符串的日期格式的计算 2015-06-23 slj
	 * 
	 * @return 两日期相差的天数
	 */
	public static int daysBetween(String smdate, String bdate)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(smdate));
		long time1 = cal.getTimeInMillis();
		cal.setTime(sdf.parse(bdate));
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}

	/**
	 * 得到几天前的时间 2015-06-23 slj
	 * 
	 * @param d
	 * @param day
	 * @return
	 * @throws ParseException 
	 */
	public static String getDateBefore(String d, int day) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar now = Calendar.getInstance();
		now.setTime(sdf.parse(d));
		now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
		return getDateStr(now.getTime(),"yyyy-MM-dd");
	}

	/**
	 * 得到几天后的时间  2015-06-23 slj
	 * 
	 * @param d
	 * @param day
	 * @return
	 * @throws ParseException 
	 */
	public static String getDateAfter(String d, int day) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar now = Calendar.getInstance();
		now.setTime(sdf.parse(d));
		now.set(Calendar.DATE, now.get(Calendar.DATE) + day);
		return  getDateStr(now.getTime(),"yyyy-MM-dd");
	}
	
	/*
	 * @return
	 * @throws Exception
	 */
	public static int secondsBetween(String smdate, String bdate) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(smdate));
		long time1 = cal.getTimeInMillis();
		cal.setTime(sdf.parse(bdate));
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / 1000;
		return Integer.parseInt(String.valueOf(between_days));
	}
	public static String genAge(String birthday){
		String ageyear=birthday.substring(0, 4);
		String nowyear=getNowYear();
		String age=String.valueOf(Integer.parseInt(nowyear)-Integer.parseInt(ageyear));
		return age;
	}
	
	public static void main(String[] args) {
	  String month=	genAge("1990-6");
	   System.out.print(month);
 	}
}
