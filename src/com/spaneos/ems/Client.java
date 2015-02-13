package com.spaneos.ems;


public class Client {
	public static void main(String[] args) {
		EmployeeContainer obj = new EmployeeContainer();
		Employee maxSalEmp = obj.getMaxSalaryEmployee();
		Employee minSalEmp = obj.getMinSalaryEmployee();
		System.out.println("Max Salary Employee Details :");
		showEmployeeInfo(maxSalEmp);
		System.out.println("Min Salary Employee Details :");
		showEmployeeInfo(minSalEmp);
		System.out.println("Salary >= Given input ");
		Employee emps[] = obj.getEmployees(80000);
		for (Employee emp : emps) {
			System.out.println("--------------------------------------------------");
			showEmployeeInfo(emp);
			System.out.println("--------------------------------------------------");
		}

	}

	private static void showEmployeeInfo(Employee employee) {
		System.out.println("Empno		" + employee.getEmpno());
		System.out.println("Ename		" + employee.getName());
		System.out.println("Email		" + employee.getEmail());
		System.out.println("Salary		" + employee.getSalary());

	}
}
