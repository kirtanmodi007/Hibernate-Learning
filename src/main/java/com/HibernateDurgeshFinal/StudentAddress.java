package com.HibernateDurgeshFinal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
//Now we need to save the the table under new name name in database
//Hence, I am using table annotation
@Table(name="Address")
public class StudentAddress 
{
	@Id
	//Now we want ke aa Primary Key ni value Auto increment bane.
	//For that we need to use generatedValue Annotation
	//Identity no use karwa thi everytime jate j value increment thase.
	//Mare explicitly value set karwani jarur nathi.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdAddress")
	private int addressId;
	
	@Column(length = 30,name = "STREET")
	private String street;
	
	private String city;
	private boolean isOpen;
	
	//mare aa x column ne table ma store nathi karwi.
	//So, aa column ne hu Transient banai daish
	@Transient
	private double x;
	
	//Have jo date ma time stamp na joitu hoy, to we need to use 
	//Temporal annotation
	//So, aawu karwa thi aakho timestamp nahi aawe, just date j aawshe
	@Temporal(TemporalType.DATE)
	private Date addressDate;
	
	//Mari image ae large object hase so aena mate I need to use lob annotation
	//@Lob
	//private byte[] image;
	
	public StudentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentAddress(int addressId, String street, String city, boolean isOpen, double x, Date addressDate) 
	{
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addressDate = addressDate;
		//this.image = image;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddressDate() {
		return addressDate;
	}
	public void setAddressDate(Date addressDate) {
		this.addressDate = addressDate;
	}
	/*
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	*/
	@Override
	public String toString() {
		return "StudentAddress [addressId=" + addressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", x=" + x + ", addressDate=" + addressDate + "]";
	}
	
	

}
