package com.generics;
import java.util.*;
public abstract class Main{
	public static void main(String arg[]) {
		SalaryEmp se=new SalaryEmp();
		HourlyEmp he=new HourlyEmp();
		se.setName("abc");
		se.setSalary(2000);
		se.setAfm("111222000");
		he.setName("xyz");
		he.setHourlyPayment(200);
		he.setHoursWorked(100);
		he.setAfm("111222444");
		List<Employee> ls=new ArrayList<Employee>();
		ls.add(se);
		ls.add(he);
		System.out.println(ls.get(0)+"/n"+ls.get(1));
	}

}
