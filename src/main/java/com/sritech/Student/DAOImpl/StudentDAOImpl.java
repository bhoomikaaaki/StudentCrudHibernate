package com.sritech.Student.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.sritech.Student.DAO.StudentDAO;
import com.sritech.Student.Model.Student;

public class StudentDAOImpl implements StudentDAO {
	
	
	private SessionFactory sessionFactory;
	
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Student> getStudentsList() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Student");
		List<Student> list = query.list();
		
		return list;
	}

	public Student getStudentById(int studentId){
		
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Student where student_id=:id");
		query.setParameter("id", studentId);
		List<Student> list = query.list();
		
		Student student = list.get(0);
		
		return student;
	}

	public void saveRecord(Student student) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		System.out.println("sucessfully inserted");
		
	}

	public int updateRecord(Student student) {

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("update Student set student_Name=:name,student_course=:course,student_gender=:gender,student_age=:age where student_id=:id");
		query.setParameter("name", student.getStudentName());
		query.setParameter("course", student.getStudentCourse());
	 	query.setParameter("gender", student.getStudentGender());
		query.setParameter("age", student.getStudentAge());
		query.setParameter("id", student.getStudentId());
		
		int count = query.executeUpdate();
		
		transaction.commit();

		return count;
	}

	public int deleteRecordById(int studentId) {


		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("delete from Student where student_id=:id");
		query.setParameter("id", studentId);
		int count =  query.executeUpdate();
		
		transaction.commit();

		return count;
	}
	
	

}
