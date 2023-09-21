package com.enviro.assessment.grad001.dibusengdikgoele.springbootassessments.springbootassessment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Investor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String surname;
	
	@Column
	private int age;
	
	@Column
	private String emaildAddress;
	
	@Column
	private String product;
	
	@Column
	private double balance;

	public Investor(int id, String name, String surname, int age, String emaildAddress, String product,
			double balance) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.emaildAddress = emaildAddress;
		this.product = product;
		this.balance = balance;
	}

	public Investor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmaildAddress() {
		return emaildAddress;
	}

	public void setEmaildAddress(String emaildAddress) {
		this.emaildAddress = emaildAddress;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
