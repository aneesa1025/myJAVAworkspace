package com.bank;

public abstract class Bank {
	private String name;
	private String address;
	private String type;
	
	protected abstract int getLoanPercentage(); 
	protected abstract int getDepositInterest();
	
	public void setName(String n) {
		this.name = n;
	}	
	public String getName() {
	return this.name;	
	}
	
	public void setAddress(String a) {
		this.address = a;
	}
	public String getAddress() {
		return this.address;
	}
	
	public void setType(String t) {
		this.type = t;
		
	}
	public String getType() {
		return this.type;
	}
	}
		
		
		
		
	
