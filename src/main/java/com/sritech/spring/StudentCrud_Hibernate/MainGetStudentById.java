package com.sritech.spring.StudentCrud_Hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sritech.Student.DAO.StudentDAO;
import com.sritech.Student.DAOImpl.StudentDAOImpl;
import com.sritech.Student.Model.Student;

public class MainGetStudentById {
	
	public static void main(String[] args) {
		
ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
    	
    	StudentDAO studentDAO=(StudentDAOImpl)context.getBean("studentDAO");
    	
    	Student student = studentDAO.getStudentById(2);
    	System.out.println(student);
		
		
	}

}
