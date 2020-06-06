package com.chinasoft.mapper;

import java.util.List;
import java.util.Map;

import com.chinasoft.pojo.User;

public interface UserMapper {
	List<User> selectUserByPage(Map map);
	void DynamicInsert(User user);
}
