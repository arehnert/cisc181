package com.cisc181.core;

import java.util.UUID;

public class Course {
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	
	private String Major;

	public String getMajor( ) {
		return this.Major;
	}

	public void setMajor (String Major) {
		this.Major = Major;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	
}
