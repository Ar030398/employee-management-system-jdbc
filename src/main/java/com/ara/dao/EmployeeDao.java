package com.ara.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ara.model.Employee;
import com.ara.util.DbConnection;

public class EmployeeDao {
	
       public void addEmployee(Employee emp) throws InterruptedException {
    	   
    	   Connection con = DbConnection.createconnection();
    	   
    	   String query="Insert into employee(name,age,department) value( ? ,?,?)";
    	   
    	   try {
			PreparedStatement ps=con.prepareStatement(query);
		   ps.setString(1,emp.getName());
		   ps.setDouble(2,emp.getAge());
		   ps.setString(3,emp.getDepartment());
		   
		   int row = ps.executeUpdate();
		   
		   if(row>0) {
			   System.out.println("Employee add successfully::");
		   }
		   con.close();
    	   
    	   } catch (SQLException e) {
			
			e.printStackTrace();
    	   } 
    	   
    	   Thread.sleep(5000);
       }

       public void viewEmployee() throws InterruptedException {
    	   
    	   Connection con = DbConnection.createconnection();
    	   
    	   String qurey = "Select * from employee";
    	   
    	   try {
			PreparedStatement ps = con.prepareStatement(qurey);
			ResultSet rs= ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt("id")+"|"+
						rs.getString("Name")+"|"+
						rs.getDouble("age")+"|"+
						rs.getString("department"));
			}
			con.close();
		} catch (SQLException e) {
	       e.printStackTrace();
		}
    	   
    	   Thread.sleep(5000);
      }
       
       public void updateEmployee(int id,String name) throws SQLException, InterruptedException{
    	  
    	   Connection con = DbConnection.createconnection();
    	   
    	   String qurey ="Update employee set department=? where id=?  ";
    	   
    	   PreparedStatement ps = con.prepareStatement(qurey);
    	   ps.setString(1, name);
    	   ps.setInt(2, id);
    	   
    	   int row= ps.executeUpdate();
       
          if (row>0) {
        	  System.out.println("Employee uodated::");
          }else {
        	  System.out.println("Employee not found::");
          }
       con.close();
       Thread.sleep(5000);
       
       }
       
       public void deleteEmployee(int id) throws SQLException, InterruptedException {
    	
    	   Connection con=DbConnection.createconnection();
    	   
    	   String qurey="Delete from employee where id=?";
    	   
    	   PreparedStatement ps= con.prepareStatement(qurey);
    	   
    	   ps.setInt(1, id);
    	   
    	   int row=ps.executeUpdate();
    	   
    	   if(row>0) {
    		   System.out.println("Employee Deleted::");
    	   }else {
    		   System.out.println("Employee not available::");
    	   }
    	   Thread.sleep(5000);
       }
        
}
