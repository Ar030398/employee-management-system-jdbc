package com.ara.model;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;

//@Getter
//@Setter
//@AllArgsConstructor
public class Employee {

	private int id;
	private String name;
	private double age;
	private String department;
	
	public Employee(String name,double age,String department) {
	      this.age=age;
          this.department=department;
          this.name=name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	 
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age=age;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department=department;
	}
	
}
