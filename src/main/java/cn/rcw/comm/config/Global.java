package cn.rcw.comm.config;

/**
 * @author zhuyg
 * @date 2015-7-28
 * @version 1.0
 */
public class Global {

	/*
	 * 模块分类
	 */
	//顶部导航
	public final static String FUNC_TYPE_MENU = "menu";
	//左侧导航
	public final static String FUNC_TYPE_FUNC = "func";
	//按钮
	public final static String FUNC_TYPE_BUTTON = "button";
	
	//验证码
	public final static String VALIDATE_CODE = "VALIDATE_CODE";
	
	//session标示
	public final static String SESSION_USER = "SESSION_USER";
	
	public final static String SESSION_USERNAME = "USERNAME";
	
	//session key 模拟登录前端session标示
	public final static String USERSESSION = "USERSESSION";
	
	
	/*个人账号状态 wa_js_user  ACCOUNT_STATUS  add cc 20151117*/
	public final static Integer ACCOUNT_STATUS_NORMAL=1;//正常	
	public final static Integer ACCOUNT_STATUS_FORBID=2;//禁用
	public final static Integer ACCOUNT_STATUS_SHIELD=3;//屏蔽
	public final static Integer ACCOUNT_STATUS_LOCKED=4;//锁定
	public final static Integer ACCOUNT_STATUS_DEL=5;//已删除
	
	//网猎通交易类型 1=充值  2=扣点  3=删除扣点
	public final static Integer AC_TYPE_IN = 1;
	public final static Integer AC_TYPE_OUT = 2;
	public final static Integer AC_TYPE_DEL = 3;
	
	//紧急招聘
	public final static String URGENT_JOBS = "job001_jobs_emergent";
	//金牌招聘
	public final static String ISEMENT_jobs = "job001_jobs_medal";
	//职位置顶
	public final static String STICKT_JOBS = "job001_jobs_stick";
	//职位变色
	public final static String COLOR_jobs = "job001_jobs_color";
	

	//合同广告增值类型
	public final static String CONTYPE_ADVERT = "job001_advertisement";//合同广告类型key
	public final static String CONTYPE_ADD_LINE = "job001_value_add_line";//合同增值、线下key
	
	//服务基层类型key
	public final static String SERVICE_CV = "job001_product_resume";//简历key
	public final static String SERVICE_JOB = "job001_product_jobs";//职位key
	
	
	public final static Integer RECHARGE_TYPE_ZFT=3;//判断是否支付通服务，支付通套餐id
	public final static Integer RECHARGE_TYPE_SUPERZFT=4;//判断是否超级支付通，支付通套餐id

	//账户类型
	public final static Integer AC_TYPE_RESUME = 1;//简历
	public final static Integer AC_TYPE_JOBS = 2;//职位
	//交易类型
	public final static Integer TRANS_TYPE_ADD_CON = 1;//合同增加
	public final static Integer TRANS_TYPE_DEDUCT = 2;//扣点
	public final static Integer TRANS_TYPE_UP_CON = 3;//合同修改
	public final static Integer TRANS_TYPE_DEL_CON = 4;//合同删除
	//支付通时间记录状态
	public final static Integer CON_SET_INIT = 1;//待执行
	public final static Integer CON_SET_EXECUTING = 2;//正在执行
	public final static Integer CON_SET_EXECUTED = 3;//已执行
	
	//添加广告是否要判断合
	public final static Integer CONTRACT_STATE_YES = 1; //是
	public final static Integer CONTRACT_STATE_NO = 0; //否
	
	public final static Integer CLASSIFY_DRAFT  = 0; //草稿箱
	public final static Integer CLASSIFY_RECRUIT = 1;  //招聘中
	public final static Integer CLASSIFY_PAUSE = 2;  //暂停中
	public final static Integer CLASSIFY_FILE = 3;  //归档职位

}
