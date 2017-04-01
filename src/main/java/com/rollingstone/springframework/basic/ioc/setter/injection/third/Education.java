package com.rollingstone.springframework.basic.ioc.setter.injection.third;

import java.time.LocalDate;

public class Education {

	private long educationID;
	
	private String degreeName;
	
	private String degreeDescription;
	
	private LocalDate started;
	
	private LocalDate completed;
	
	private boolean hasReceivedDegree;
	
	private String univeersity;
	
	private float gpa;

	public long getEducationID() {
		return educationID;
	}

	public void setEducationID(long educationID) {
		this.educationID = educationID;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public String getDegreeDescription() {
		return degreeDescription;
	}

	public void setDegreeDescription(String degreeDescription) {
		this.degreeDescription = degreeDescription;
	}

	public LocalDate getStarted() {
		return started;
	}

	public void setStarted(LocalDate started) {
		this.started = started;
	}

	public LocalDate getCompleted() {
		return completed;
	}

	public void setCompleted(LocalDate completed) {
		this.completed = completed;
	}

	public boolean isHasReceivedDegree() {
		return hasReceivedDegree;
	}

	public void setHasReceivedDegree(boolean hasReceivedDegree) {
		this.hasReceivedDegree = hasReceivedDegree;
	}

	public String getUniveersity() {
		return univeersity;
	}

	public void setUniveersity(String univeersity) {
		this.univeersity = univeersity;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public Education(long educationID, String degreeName, String degreeDescription, LocalDate started,
			LocalDate completed, boolean hasReceivedDegree, String univeersity, float gpa) {
		super();
		this.educationID = educationID;
		this.degreeName = degreeName;
		this.degreeDescription = degreeDescription;
		this.started = started;
		this.completed = completed;
		this.hasReceivedDegree = hasReceivedDegree;
		this.univeersity = univeersity;
		this.gpa = gpa;
	}

	public Education() {
		super();
	}

	@Override
	public String toString() {
		return "Education [educationID=" + educationID + ", degreeName=" + degreeName + ", degreeDescription="
				+ degreeDescription + ", started=" + started + ", completed=" + completed + ", hasReceivedDegree="
				+ hasReceivedDegree + ", univeersity=" + univeersity + ", gpa=" + gpa + "]";
	}


	
	
	
}
