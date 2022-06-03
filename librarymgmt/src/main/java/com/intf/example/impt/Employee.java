package com.intf.example.impt;

public abstract class Employee {
	protected abstract String getJobType();
	
	protected abstract int getSalary();
	
	//Non Abstract Method
	public String getEmployeeDetail(){
		
		return "Name: Anisha Adress:Bkt";
		
	}
	
}
