package com.chinasoft.controller._02_controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class controller01 implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("controller first method");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", "sb");
		mav.setViewName("/hello.jsp");
		return mav;
	}

}
