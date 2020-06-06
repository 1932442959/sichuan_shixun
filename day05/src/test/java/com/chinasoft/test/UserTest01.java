package com.chinasoft.test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.chinasoft.mapper.GenderMapper;
import com.chinasoft.mapper.StudentMapper;
import com.chinasoft.mapper.UserMapper;
import com.chinasoft.pojo.Gender;
import com.chinasoft.pojo.Student;
import com.chinasoft.pojo.User;
import com.chinasoft.util.SessionUtil;

public class UserTest01 {

	public SqlSessionFactory factory = SessionUtil.getSession();

	public static void main(String[] args) {
		System.out.println("654321");
	}

	// 多对一 ：查询多个学生对应一个班级
	@Test
	public void selectOneStudentWithGender() {
		SqlSession session = factory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<Student> student = mapper.SelectOneAll(1);
		for (Student student2 : student) {
			System.out.println(student2);
		}
		session.close();
	}

	// 一对多：查询一个班级对应多个学生
	@Test
	public void selectOneGenderWithStudnet() {
		SqlSession session = factory.openSession();
		GenderMapper mapper = session.getMapper(GenderMapper.class);
		Gender gender = mapper.selectOneGender(1);
		System.out.println(gender);
		session.close();
	}

	// 分页查询
	@Test
	public void selectUserByPage() {
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("start", 0);
		map.put("end", 3);
		List<User> user = mapper.selectUserByPage(map);
		for (User user2 : user) {
			System.out.println(user2);
		}
		session.close();
	}

	// 动态添加用户
	@Test
	public void DynamicInsert() {
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User();
		user.setId(9);
		user.setUsername("dsb");
		user.setPassword("456457");
		user.setAddress("1294896");
		user.setPhone("6783453453");
		user.setC_id(2);
		mapper.DynamicInsert(user);
		session.commit();
		session.close();
	}
}
