package com.education.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
