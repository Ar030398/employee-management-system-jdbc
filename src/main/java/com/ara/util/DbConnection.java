package com.ara.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnection {

	public static Connection createconnection() {

		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mySql: //localhost:3306/employeemanagement", "root", "your password");

			System.out.println("Detabase connected sucessfully::");

		} catch (Exception e) {
			System.out.println(e);

		}

		return con;
	}
}