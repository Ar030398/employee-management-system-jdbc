package com.ara.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.ara.dao.EmployeeDao;
import com.ara.model.Employee;

public class ManagementSystemApp {

	public static void main(String[] args) throws SQLException, InterruptedException {

		Scanner sc = new Scanner(System.in);
		EmployeeDao dao = new EmployeeDao();
          
		
		
		while (true) {
			System.out.println("Select from below Options::");
			System.out.println("1::Add Employee");
			System.out.println("2::View Employee");
			System.out.println("3::Update Employee");
			System.out.println("4::Delete Employees");

			int choise = sc.nextInt();

			switch (choise) {

			case 1:
				System.out.println("Enter name:");
				String name = sc.next();

				System.out.println("Enter age:");
				double age = sc.nextDouble();

				System.out.println("Enter Department:");
				String department = sc.next();

				Employee emp = new Employee(name, age, department);
				
				dao.addEmployee(emp);

			  break;
			  
			case 2 :
				dao.viewEmployee();
				
				break;
				
			case 3:
				System.out.println("Enter your id:");
				int updateId =sc.nextInt();
				
				System.out.println("Enter new Department:");
				String updatedDepart = sc.next();
				
				
				dao.updateEmployee(updateId, updatedDepart);
				break;
				
			case 4:
				
				System.out.println("Enter id to delete:");
				int deleteId = sc.nextInt();
				dao.deleteEmployee(deleteId);
				
				break;
				
				default:
					System.out.println("Invalid Choise");
			}
			
			
		}
		
		

	}
}
