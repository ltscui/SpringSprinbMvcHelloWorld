package com.ltcui.student.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ltcui.student.entity.Student;
import com.ltcui.student.services.StudentServices;

@Controller
public class StudentController {
	private static Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Resource
	private StudentServices studentServices;

	@ResponseBody
	@RequestMapping(value="student", method=RequestMethod.GET)
	public String getStudent(String stuId) {
		Student stu = studentServices.getStudentById("1");
		
		logger.info(stu.toString());
		
		return stu.toString();
	}
}
