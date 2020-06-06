package com.chinasoft.controller._02_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller03 {

	@RequestMapping("/controller03.do")
	public ModelAndView method03() {
		System.out.println("controll third method");
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", "sb");
		mav.setViewName("/hello.jsp");
		return mav;
	}
}
