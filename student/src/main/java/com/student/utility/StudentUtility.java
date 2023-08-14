package com.student.utility;

import org.springframework.context.annotation.Configuration;

import com.student.dto.StudentDto;
import com.student.model.Student;

@Configuration
public class StudentUtility {


	public StudentDto convertEntityToDto(Student student) {

		StudentDto studentDto = new StudentDto();
		studentDto.setAddress(student.getAddress());
		studentDto.setEmailAddress(student.getEmailAddress());
		studentDto.setStudentName(student.getStudentName());
		studentDto.setTelephoneNumber(student.getTelephoneNumber());
		return studentDto;
	}

	public Student convertDtoToEntity(StudentDto studentDto) {

		Student student = new Student();
		student.setAddress(studentDto.getAddress());
		student.setEmailAddress(studentDto.getEmailAddress());
		student.setStudentName(studentDto.getStudentName());
		student.setTelephoneNumber(studentDto.getTelephoneNumber());
		return student;
	}

}
