package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	public double Grade;
	
	private Enrollment() 
	{	super();
		
	}
	
	public Enrollment (UUID _StudentID, UUID _SectionID) {
		setStudentID(_StudentID);
		setSectionID(_SectionID);
		setEnrollmentID(UUID.randomUUID());
		
	}
	 
	public void SetGrade(double grade) {
		Grade = grade;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}	
}

