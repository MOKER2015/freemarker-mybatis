package cn.rcw.comm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import cn.rcw.comm.util.PropertiesUtil;
/**
 * 控制器前置条件
 * 加载  图片 , css, js 路径
 * @author slj
 * @date 2015-06-26
 * @version 1.0
 */
@Controller
public class BaseController {
	
	public String cssPath = PropertiesUtil.getStringProperties("css.path");
	public String jsPath = PropertiesUtil.getStringProperties("js.path");
	public String imagePath = PropertiesUtil.getStringProperties("image.path");
	public String imgPath = PropertiesUtil.getStringProperties("img.path");
	public String ftlPath = PropertiesUtil.getStringProperties("ftl.path");
	public String docPath = PropertiesUtil.getStringProperties("doc.path");
	
	//猎头新增
	public String recCssPath = PropertiesUtil.getStringProperties("rec.css.path");
	public String recJsPath = PropertiesUtil.getStringProperties("rec.js.path");
	public String recImagePath = PropertiesUtil.getStringProperties("rec.image.path");
	public String recImgPath = PropertiesUtil.getStringProperties("rec.img.path");
	public String recCompanyImg = PropertiesUtil.getStringProperties("rec.company.img");
	public String recResumeImg = PropertiesUtil.getStringProperties("rec.resume.img");
	
    	
	
	@ModelAttribute
	public void populateModel(HttpServletRequest request, Model model) throws Exception {
		String contextPath = request.getContextPath();
		model.addAttribute("cssPath", cssPath);
		model.addAttribute("jsPath", jsPath);
		model.addAttribute("imagePath", imagePath);
		model.addAttribute("imgPath", imgPath);
		model.addAttribute("contextPath",contextPath);
		
		
		model.addAttribute("recCssPath",recCssPath);
		model.addAttribute("recJsPath",recJsPath);
		model.addAttribute("recImagePath",recImagePath);
		model.addAttribute("recImgPath",recImgPath);
		model.addAttribute("recCompanyImg",recCompanyImg);
		model.addAttribute("recResumeImg",recResumeImg);
		
		
	}
}
