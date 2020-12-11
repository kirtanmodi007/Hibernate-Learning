package com.HibernateDurgeshFinal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer 
{
	@Id
	private int answerId;
	private String answerString;

}
