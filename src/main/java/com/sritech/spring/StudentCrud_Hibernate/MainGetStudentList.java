package com.sritech.spring.StudentCrud_Hibernate;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.sritech.Student.DAO.StudentDAO;
import com.sritech.Student.DAOImpl.StudentDAOImpl;
import com.sritech.Student.Model.Student;

public class MainGetStudentList 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
    	
    	StudentDAO studentDAO=(StudentDAOImpl)context.getBean("studentDAO");
    	List<Student> list = studentDAO.getStudentsList();
    	Iterator<Student> iterator = list.iterator();
    	while(iterator.hasNext()){
    		System.out.println(iterator.next());
    	}
    	
    }
}
