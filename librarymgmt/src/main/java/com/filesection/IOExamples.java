package com.filesection;

	import java.util.Scanner;

	public class IOExamples {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	            System.out.println("Enter your rollno");
	            int rollno = sc.nextInt();

	            System.out.println("Enter your name");
	            String name = sc.next();
	            System.out.println("Enter your fee");
	            double fee = sc.nextDouble();
	            System.out.println("Rollno:" + rollno + " name:" + name + " fee:" + fee);

	            System.out.println("Type exit for exiting");
	            if (sc.next().equals("exit")) {
	                sc.close();
	            }
	    }

	}


