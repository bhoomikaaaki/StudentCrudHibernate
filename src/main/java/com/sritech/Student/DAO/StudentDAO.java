package com.sritech.Student.DAO;

import java.util.List;

import com.sritech.Student.Model.Student;

public interface StudentDAO {
	
	public List<Student> getStudentsList();
	public Student getStudentById(int studentId);
	public void saveRecord(Student student);
	public int updateRecord(Student student);
	public int deleteRecordById(int studentId);

}
