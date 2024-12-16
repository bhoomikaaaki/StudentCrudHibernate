package com.sritech.Student.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="student")
public class Student {
	@Id
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="student_Name")
	private String studentName;
	
	@Column(name="student_course")
	private String studentCourse;
	
	@Column(name="student_gender")
	private String studentGender;
	
	@Column(name="student_age")
	private int studentAge;

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public int getStudentAge() {
		return studentAge;
	}

	@Override
	public String toString() {
		return studentId + "\t" + studentName + "\t" + studentCourse
				+ "\t" + studentGender + "\t" + studentAge ;
	}
	

		
}
