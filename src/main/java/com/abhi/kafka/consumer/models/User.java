package com.abhi.kafka.consumer.models;

import java.math.BigInteger;

public class User {
	private String name;
	
	private BigInteger salary;
	
	private String dept;
	
	public User() {
		super();
	}
	
	public User(String name, BigInteger salary, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getSalary() {
		return salary;
	}

	public void setSalary(BigInteger salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	
	
	
	

}
