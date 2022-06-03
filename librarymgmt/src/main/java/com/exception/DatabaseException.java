package com.exception;

public class DatabaseException extends Exception {

	public DatabaseException(String message, Throwable cause) {
		super(message, cause);
		System.out.println(message);
		// TODO Auto-generated constructor stub
	}

	public DatabaseException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
     

}
