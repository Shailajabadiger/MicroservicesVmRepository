package com.mindtree.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.model.Student;
import com.mindtree.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
private StudentService studentService;
@RequestMapping(value="/create",method=RequestMethod.POST)
public String create(@RequestParam int id,@RequestParam String name,@RequestParam int age,@RequestParam String location,@RequestParam String dob)
{
	Student s=studentService.create(id,name, age, location, dob);
	return s.toString();
}
@RequestMapping(value="/getstudentbyid",method=RequestMethod.GET)
public Student getStudent(@RequestParam int id)
{
	return studentService.getStudentById(id);
}
@RequestMapping(value="/getAll",method=RequestMethod.GET)
public List<Student> getAll()
{
	return studentService.getAll();
}
@RequestMapping(value="/update",method=RequestMethod.PUT)
public String update(@RequestParam int id,@RequestParam String name,@RequestParam int age,@RequestParam String location,@RequestParam String dob)
{
	Student s=studentService.update(id,name,age,location,dob);
	return s.toString();
}
@RequestMapping(value="/delete",method=RequestMethod.DELETE)
public String delete(@RequestParam int id)
{
	studentService.delete(id);
	return "Student with "+id+" deleted";
}

}/*public String logoutPage(HttpServletRequest request,HttpServletResponse response)
{
	org.springframework.security.core.Authentication auth=SecurityContextHolder.getContext().getAuthentication();
	if(auth!=null) {
		new SecurityContextLogoutHandler().logout(request, response, auth);
	}
		return null;
	}
}*/

