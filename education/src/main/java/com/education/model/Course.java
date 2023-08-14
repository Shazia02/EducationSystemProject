package com.education.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {

	private @Id @GeneratedValue Long courseId;
	private String courseName;
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

	Course() {

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
