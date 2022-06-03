package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.login.User;

public class DatabaseOperator {

	public static boolean validate(String username, String password) {
		try {
			Connection con = getConnection();
			String sql = "SELECT count(*) FROM user where username=? and  password=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet result = stmt.executeQuery();
			result.next();
			int count = result.getInt(1);
			if (count == 1) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return false;
	}
	public static List<User> getUsersList() throws ClassNotFoundException,SQLException {
		List<User> users = null;
		try {
			
			Connection con =getConnection();
			String sql ="SELECT * FROM user ";
					PreparedStatement stmt=con.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();
					users = new ArrayList<User>();
					while (rs.next()) {
						User user = new User();
						user.setUsername(rs.getString(1));
						user.setPassword(rs.getString(2));
						user.setCreatedOn(rs.getString(3));
						users.add(user);
						
					}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return users;
		}

	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system", "root",
				"");
		return con;
	}

}
