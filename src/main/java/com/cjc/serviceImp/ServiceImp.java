package com.cjc.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cjc.dao.Dao;
import com.cjc.model.Student;
import com.cjc.service.Service;
@org.springframework.stereotype.Service
public class ServiceImp implements Service {
  @Autowired
	private Dao dao;
	@Override
	public int register(Student student) {
		dao.save(student);
		return 0;
	}

	@Override
	public List<Student> display() {
		List<Student> list=(List<Student>) dao.findAll();
		return list;
	}

	@Override
	public int update(Student student) {
		dao.save(student);
		return 0;
	}

	@Override
	public int delete(int id) {
		dao.deleteById(id);
		return 0;
	}

}
