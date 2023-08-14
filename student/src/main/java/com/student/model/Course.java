package com.student.model;

import java.util.Objects;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
	
	 @Column(name="course_id")
	  private @Id @GeneratedValue Long courseId;
	 
	 @Column(name="course_name")
	  private String courseName;
	 
	 @Column(name="course_duration")
	  private int courseDuration;
	public Long getId() {
		return courseId;
	}
	
	public void setId(Long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	
	  @ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "course_id", nullable = false)
	  @OnDelete(action = OnDeleteAction.CASCADE)
	  @JsonIgnore
	  private Student student;

	Course(){
		
	}
	

	
	public Course(String courseName, int courseDuration) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseDuration, courseName, courseId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseDuration == other.courseDuration && Objects.equals(courseName, other.courseName)
				&& Objects.equals(courseId, other.courseId);
	}
	@Override
	public String toString() {
		return "Course [id=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration + "]";
	}
	
	
	  
}
