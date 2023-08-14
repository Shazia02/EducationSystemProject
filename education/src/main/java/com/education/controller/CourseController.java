package com.education.controller;

import java.util.List;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.education.model.Course;
import com.education.repository.CourseRepository;

@RestController
public class CourseController {
	
	private static final Logger log = LoggerFactory.getLogger(CourseController.class);
	private final CourseRepository repository;

	CourseController(CourseRepository repository) {
	    this.repository = repository;
	  }
	
	 @GetMapping("/welcome")
	  public String welcome() {
		 log.info("inside welcome");
		 return "welcome";
	   
	  }
	 
	//get courses
	 @GetMapping("/courses")
	  public ResponseEntity<String> allCourses() {
		 log.info("inside allCourses");
		 List<Course> courseList=repository.findAll();
		 JSONObject json = new JSONObject();
		 json.put("result", courseList);
		 return ResponseEntity.ok().body(json.toString());
	  }
	 
	 //add course
	 @PostMapping("/courses")
	 public ResponseEntity<String> addCourse(@RequestBody Course newCourse) {
	     repository.save(newCourse);
	     return ResponseEntity.ok().body("Student added with success!");		
	  }

	 //update course
	  @PutMapping("/courses/{id}")
	  public ResponseEntity<String> updateCourse(@RequestBody Course newCourse, @PathVariable Long id) {
	    
	    return repository.findById(id)
	      .map(course -> {
	    	  course.setCourseName(newCourse.getCourseName());
	    	  course.setCourseDuration(newCourse.getCourseDuration());
	         repository.save(course);
	         return ResponseEntity.ok().body("Student updated with success!");
	      })
	      .orElseGet(() -> {
	    	  newCourse.setId(id);
	         repository.save(newCourse);
	        return ResponseEntity.ok().body("Student updated with success!");
	      });
	  }

	  //delete course
	  @DeleteMapping("/courses/{id}")
	  public ResponseEntity<String> deleteCourse(@PathVariable Long id) {
	    repository.deleteById(id);
	    return ResponseEntity.ok().body("Student deleted with success!");
	  }
	 
	 


}
