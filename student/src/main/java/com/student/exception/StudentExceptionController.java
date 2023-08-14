package com.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionController extends RuntimeException {
	
	   private static final long serialVersionUID = 1L;
	   
	   @ExceptionHandler(value = StudentNotfoundException.class)
	   public ResponseEntity<Object> exception(StudentNotfoundException exception) {
		   return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
	   }
	   
	   @ExceptionHandler(value = CourseNotfoundException.class)
	   public ResponseEntity<Object> exception(CourseNotfoundException exception) {
		   return new ResponseEntity<>("Course not found", HttpStatus.NOT_FOUND);
	   }
	}