package com.database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.exception.DatabaseException;


public class DatabaseOperator {
	public static int saveRecord(String name, String address) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoping_cart", "root" ,"" );
	     Statement statement = connection.createStatement();
	     statement.executeUpdate("insert into product values(20, 20, 2300)");
	     
		return 0;
		
		
	}
	public static void getRecords() throws DatabaseException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoping_cart", "root" ,"" );
	     Statement statement = connection.createStatement();
	     ResultSet result = statement.executeQuery("select * from customer");
	     while (result.next()) {
	    	 int id = result.getInt(1);
	    	 String name = result.getString(2);
	    	 String address = result.getString(4);
	    	 String phone = result.getString(3);
	    	 System.out.println("id:"+ id +" name:"+ name +" address:"+ address +" phone:" +phone );
	    	 
	     }
	  
	     throw new DatabaseException("testssdtts");
	     
	     
	}
	public static void updateRecord(String name, String address, int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoping_cart", "root" ,"" );
	    
		String sql = "update customer set name = ?, address=? where id=?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, name);
		statement.setString(2, address);
		statement.setInt(3, id);
		statement.execute();
		System.out.println("Record updated successfully");
		
		
	     
	}     
	public static void saveRecordViaConsole() throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		 Class.forName("com.mysql.jdbc.Driver");

	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoping_cart", "root", "");
	        PreparedStatement ps = con.prepareStatement("insert into customer values(?,?,?,?)");

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        do {
	            System.out.println("enter id:");
	            int id = Integer.parseInt(br.readLine());
	            System.out.println("enter name:");
	            String name = br.readLine();
	            System.out.println("enter Address:");
	            String address = br.readLine();

	            System.out.println("enter Phone Number:");
	            String phoneNumber = br.readLine();

	            ps.setInt(1, id);
	            ps.setString(2, name);
	            ps.setString(4, address);
	            ps.setString(3, phoneNumber);

	            int i = ps.executeUpdate();
	            System.out.println(i + " records affected");

	            System.out.println("Do you want to continue: y/n");
	            String s = br.readLine();
	            if (s.startsWith("n")) {
	                break;
	            }
	        } while (true);

	        con.close();
	    }
	
	public static void delectRecords(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoping_cart", "root" ,"" );
	     Statement statement = connection.createStatement();
	      statement.executeUpdate("delete from customer where id= " +id);
	  
	     System.out.println("Record delete successfully");
	     
	}
	     
	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
//		saveRecord("", "");
	//	getRecords();
	//updateRecord("Anisha", "thimi", 1);
//		saveRecordViaConsole();
		delectRecords(1);
		
		
	}
	

}
 