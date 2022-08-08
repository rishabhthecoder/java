package com.generics;

public class SalaryEmp implements Employee{
	
	private String name;
	private String afm;
	private int salary;

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setAfm(String afm) {
		// TODO Auto-generated method stub
		this.afm=afm;
	}

	@Override
	public String getAfm() {
		// TODO Auto-generated method stub
		return afm;
	}
	public int getSalary() {
		return this.salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	@Override
	public String toString() {
		System.out.println("Salary Emp");
		return "Name:- "+name+" Afm:- "+afm+" Salary:- "+salary; 
	}
}
