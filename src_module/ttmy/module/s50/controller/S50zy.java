package ttmy.module.s50.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import ttmy.framework.base.controller.BaseController;
import ttmy.module.s50.service.IS50service;

@Controller
public class S50zy extends BaseController {

	@Resource(name = "s50service")
	private IS50service s50service;

	@RequestMapping("actionrulePage.htm")
	public ModelAndView login(String username, String password) {
		if(s50service.checkUserPwd(username, password)){
			
		}
		return new ModelAndView("navigation");
	}
}
