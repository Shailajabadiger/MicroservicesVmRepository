package com.mindtree.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,String>{

	public Student findById(int id);

	public List<Student> findByLocation(String location);
}
