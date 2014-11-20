package ttmy.module.s50.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import ttmy.framework.base.controller.BaseController;
import ttmy.module.s50.service.IS50service;

@Controller
public class S50controller extends BaseController {

	@RequestMapping("loginPage.htm")
	public String toLogin() {
		// 打开登录页面
		return "login";
	}

	@RequestMapping("actionrulePage.htm")
	public String toActionRole() {
		// 打开活动规则页面
		return "actionrule";
	}

	@Resource(name = "s50service")
	private IS50service s50service;

	@RequestMapping("login.htm")
	public ModelAndView login(String phone) {
		return null;
	}

}
