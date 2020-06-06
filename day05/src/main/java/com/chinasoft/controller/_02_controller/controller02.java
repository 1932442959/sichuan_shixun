package com.chinasoft.controller._02_controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class controller02 implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("controller second method");
		request.setAttribute("user", "ssbssb");
		request.getRequestDispatcher("/hello.jsp").forward(request, response);
	}

}
