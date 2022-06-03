package com.intf.example.impt;

public class FinanceEmployee extends Employee {
	@Override
	public String getJobType() {
		return "Finance";
	}
	@Override

	protected int getSalary() {
		return 2000;
	}
	
	

}
