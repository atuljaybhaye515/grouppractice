package com.cjc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public interface Dao extends CrudRepository<Student,Integer> {
int sub();
	int add();
}
