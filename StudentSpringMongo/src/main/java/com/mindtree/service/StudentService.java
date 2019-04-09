package com.mindtree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.model.Student;
import com.mindtree.repository.StudentRepository;

@Service
public class StudentService {
@Autowired
private StudentRepository studentRepository;

public Student create(int id, String name,int age,String location,String dateOfBirth)
{
	return (Student) studentRepository.save(new Student(id,name,age,location,dateOfBirth));
}
public List<Student> getAll()
{
	return studentRepository.findAll();
}
public Student getStudentById(int id)
{
	return studentRepository.findById(id);
}
public Student update(int id,String name,int age,String location,String dateOfBirth)
{
	Student s=studentRepository.findById(id);
	s.setName(name);
	s.setLocation(location);
	s.setAge(age);
	s.setDateOfBirth(dateOfBirth);
	return (Student) studentRepository.save(s);
}
public void delete(int id)
{
	Student s=studentRepository.findById(id);
	studentRepository.delete(s);
}
}

   