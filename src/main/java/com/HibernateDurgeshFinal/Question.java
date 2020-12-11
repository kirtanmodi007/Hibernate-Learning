package com.HibernateDurgeshFinal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question 
{
	@Id
	private int questionId;
	private String questionString;
	
	private Answer answer;

}
