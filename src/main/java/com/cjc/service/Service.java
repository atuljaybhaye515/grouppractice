package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface Service {
	
	public int register(Student student);
	public List<Student> display();
	public int update(Student student);
	public int delete(int id);
	

}
