package com.capgemini.tcc.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
	public static Connection getConnection(){
		String url="";
		String username=""; 
		String pwd="";
		String driver="";
		Connection con=null;
		try {
			InputStream in= new FileInputStream("./resources/db.properties");
			Properties prop= new Properties();
			prop.load(in);
			driver= prop.getProperty("driver");
			url= prop.getProperty("url");
			pwd=prop.getProperty("password");
			username=prop.getProperty("username");
			Class.forName(driver);
		 con= DriverManager.getConnection(url, username, pwd);
			System.out.println("db connected..");
		} catch (ClassNotFoundException e) {
			System.out.println("class not loaded...");
		} catch (SQLException e) {
			System.out.println("not able to connect "+ e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println("File not found..");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		getConnection();
	}
	
}
