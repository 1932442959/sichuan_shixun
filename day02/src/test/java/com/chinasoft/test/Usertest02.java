package com.chinasoft.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.chinasoft.pojo.User;
import com.chinasoft.util.SessionUtil;

public class Usertest02 {
	
	public SqlSessionFactory factory = SessionUtil.getSession();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Usertest02().addUserByParameter();
		//new Usertest02().deleteUserByParameter();
		//new Usertest02().updateUserByParameter();
		//new Usertest02().selectUserByParameter();
		//new Usertest02().selectAll();
		//new Usertest02().deleteUserByList();
		new Usertest02().selectUserByList();
	}
	
	public void addUserByParameter() {
		SqlSession session = factory.openSession();
		User user = new User(4, "gsy", "332211");
		int insert = session.insert("com.chinasoft.mapper.userMapper.addUserByParameter", user);
		session.commit();
		session.close();
	}
	
	public void deleteUserByParameter() {
		SqlSession session = factory.openSession();
		int delete = session.delete("com.chinasoft.mapper.userMapper.deleteUserByParameter", 4);
		session.commit();
		session.close();
	}
	
	public void updateUserByParameter() {
		SqlSession session = factory.openSession();
		User user = new User(4, "gsys", "112233");
		int update = session.update("com.chinasoft.mapper.userMapper.updateUserByParameter", user);
		session.commit();
		session.close();
	}
	
	public void selectUserByParameter() {
		SqlSession session = factory.openSession();
		User user = session.selectOne("com.chinasoft.mapper.userMapper.selectUserByParameter", 4);
		System.out.println(user);
		session.close();
	}
	
	public void selectAll() {
		SqlSession session = factory.openSession();
		List<User> user = session.selectList("com.chinasoft.mapper.userMapper.selectAll");
		for (User user2 : user) {
			System.out.println(user2);
		}
		session.close();
	}

	public void deleteUserByList() {
		SqlSession session = factory.openSession();
		List<String> list = new ArrayList<String>();
		list.add("5");
		list.add("6");
		session.delete("com.chinasoft.mapper.userMapper.deleteUserByList", list);
		session.commit();
		session.close();
	}
	
	public void selectUserByList() {
		SqlSession session = factory.openSession();
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		List<User> user = session.selectList("com.chinasoft.mapper.userMapper.selectUserByList", list);
		for (User user2 : user) {
			System.out.println(user2);
		}
		session.close();
	}
}
