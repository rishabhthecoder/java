package com.generics;

public class HourlyEmp implements Employee {

    private String name;
    private String afm;
    private int hoursWorked;
    private int hourlyPayment;
	@Override
    public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getAfm() {
		return afm;
	}
	@Override
	public void setAfm(String afm) {
		this.afm = afm;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyPayment() {
		return hourlyPayment;
	}
	public void setHourlyPayment(int hourlyPayment) {
		this.hourlyPayment = hourlyPayment;
	}

	@Override
	public String toString() {
		System.out.println("HourlyEmp");
		return "Name:- "+name+" Afm:- "+afm+" hoursWorked:- "+hoursWorked+" hourly payment:- "+hourlyPayment; 
	}

}
