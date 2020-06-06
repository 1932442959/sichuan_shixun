package com.chinasoft.controller._04_sqlPattern;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chinasoft.mapper.GenderMapper;
import com.chinasoft.mapper.StudentMapper;
import com.chinasoft.pojo.Gender;
import com.chinasoft.pojo.Student;
import com.chinasoft.util.SessionUtil;

@Controller
@RequestMapping("/sqlpattern")
public class controller05 extends HttpServlet {

	public SqlSessionFactory factory = SessionUtil.getSession();

	@RequestMapping("/sql01.do")
	public ModelAndView sql01() {
		SqlSession session = factory.openSession();
		GenderMapper mapperg = session.getMapper(GenderMapper.class);
		Gender gender = mapperg.selectOneGender(1);
		StudentMapper mappers = session.getMapper(StudentMapper.class);
		List<Student> student = mappers.SelectOneAll(1);
		session.close();

		ModelAndView mav = new ModelAndView();
		mav.addObject("selectone", gender);
		mav.addObject("selectlist", student);
		mav.setViewName("/WEB-INF/jsp/sqlpattern.jsp");
		return mav;

	}

}
