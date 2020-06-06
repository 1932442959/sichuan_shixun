package com.chinasoft.controller._03_urlPattern;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/urlpattern")
public class controller04 {

	
	@RequestMapping("/method01.do")
	public ModelAndView method01() {
		System.out.println("controller fourth method");
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "urlpattern");
		mav.setViewName("/WEB-INF/jsp/urlpattern.jsp");
		return mav;
	}
}
