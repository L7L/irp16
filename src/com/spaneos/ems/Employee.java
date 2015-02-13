package com.spaneos.ems;

public class Employee {
		private int empno;
		private String name;
		private String email;
		private double salary;
		
		
		public Employee(String name, String email, double salary) {
			this.empno=IDGenerator.getEmpno();
			this.name = name;
			this.email = email;
			this.salary = salary;
		}
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
}
