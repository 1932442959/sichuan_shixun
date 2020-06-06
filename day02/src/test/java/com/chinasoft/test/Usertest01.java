package com.chinasoft.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.chinasoft.pojo.User;

public class Usertest01 {
	
		public static void main(String []args) {
			//new Usertest01().addUserTest();
			//new Usertest01().deleteUserTest();
			//new Usertest01().updateUserTest();
			new Usertest01().selectUserTest();
		}
	
		public void addUserTest() {
			try {
				String resource = "mybatis-config.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				SqlSession session = sqlSessionFactory.openSession();
				//session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
				int insert = session.insert("com.chinasoft.mapper.userMapper.addUser");
				session.commit();
				session.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void deleteUserTest() {
			try {
				String resource = "mybatis-config.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				SqlSession session = sqlSessionFactory.openSession();
				//session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
				int delete = session.delete("com.chinasoft.mapper.userMapper.deleteUser");
				session.commit();
				session.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void updateUserTest() {
			try {
				String resource = "mybatis-config.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				SqlSession session = sqlSessionFactory.openSession();
				//session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
				int update = session.update("com.chinasoft.mapper.userMapper.updateUser");
				session.commit();
				session.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void selectUserTest() {
			try {
				String resource = "mybatis-config.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				SqlSession session = sqlSessionFactory.openSession();
				//session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
				User user = session.selectOne("com.chinasoft.mapper.userMapper.selectUser");
				System.out.println(user);
				session.commit();
				session.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
}
