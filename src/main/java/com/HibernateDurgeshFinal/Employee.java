package com.HibernateDurgeshFinal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue()
	/*
	 * Generated Value ma tu primary key mate ni Strategy set kari shake.
	 * like Primary Key ni value jate j increment thay.
	 */
	private int id;
	
	private String firstName;
	private String lastName;
	private String city;
	
	private Certificate certi;
	
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee(int id, String firstName, String lastName, String city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}
	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + "]";
	}
	
	
	
}
