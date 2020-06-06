package com.chinasoft.mapper;

import java.util.List;

import com.chinasoft.pojo.Student;

public interface StudentMapper {
	List<Student> SelectOneAll(int id);
}
