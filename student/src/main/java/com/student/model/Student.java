package com.student.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Column(name="student_id")
	 private @Id @GeneratedValue Long studentId;
	
	@Column(name="student_name")
	 private String studentName;
	
	@Column(name="email_address")
	 private String emailAddress;
	
	@Column(name="telephone_number")
	 private Long telephoneNumber;
	
	@Column(name="address")
	 private String address;
	
    @Column(name = "course_id")
    private Long courseId;
	 
	public Long getId() {
		return studentId;
	}
	public void setId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Long getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(Long telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Student(){
		
	}
	public Student(String studentName, String emailAddress, Long telephoneNumber, String address, Long courseId) {
		super();
		this.studentName = studentName;
		this.emailAddress = emailAddress;
		this.telephoneNumber = telephoneNumber;
		this.address = address;
		this.courseId = courseId;
	}
	 
	 

}
