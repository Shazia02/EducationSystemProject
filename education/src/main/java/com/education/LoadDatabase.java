package com.education;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.education.model.Course;
import com.education.repository.CourseRepository;

@Configuration
public class LoadDatabase {
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	  @Bean
	  CommandLineRunner initDatabase(CourseRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new Course("Course1", 1)));
	      log.info("Preloading " + repository.save(new Course("Course2", 2)));
	      log.info("Preloading " + repository.save(new Course("Course3", 3)));
	      log.info("Preloading " + repository.save(new Course("Course4", 4)));
	      log.info("Preloading " + repository.save(new Course("Course5", 5)));
	    };
	  }

}
