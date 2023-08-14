package com.education.exception;

public class CourseNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5523184060534720132L;

	CourseNotFoundException(Long id) {
	    super("Could not find course " + id);
	  }
}
