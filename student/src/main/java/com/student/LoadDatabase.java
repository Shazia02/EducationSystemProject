package com.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.student.model.Student;
import com.student.repository.StudentRepository;

//import com.education.model.Course;
//import com.education.repository.CourseRepository;

@Configuration
public class LoadDatabase {
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	  @Bean
	  CommandLineRunner initDatabase(StudentRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new Student("ABC", "abc@gmail",12345L,"XYZ",0L)));
	   
	    };
	  }

}
