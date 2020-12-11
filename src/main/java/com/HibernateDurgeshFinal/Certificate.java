package com.HibernateDurgeshFinal;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate 
{
	private String courseString;
	private String durationString;
	public String getCourseString() {
		return courseString;
	}
	public void setCourseString(String courseString) {
		this.courseString = courseString;
	}
	public String getDurationString() {
		return durationString;
	}
	public void setDurationString(String durationString) {
		this.durationString = durationString;
	}
	public Certificate(String courseString, String durationString) {
		super();
		this.courseString = courseString;
		this.durationString = durationString;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
