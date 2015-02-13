package com.spaneos.emp;

public class Manager {

	public static void main(String[] args) {

		Employee employees[] = getEmployees();
		showEmployeeInfo(employees);
		System.out.println(Employee.getCount());
	
	}

	private static void showEmployeeInfo(Employee[] employees) {
			for(Employee employee:employees){
					employee.display();
				
			}
	}

	private static Employee[] getEmployees() {
		Employee employee = new Employee("Rajesh");
		Employee employee2 = new Employee("Manoj", "98868885552");
		Employee employee3 = new Employee("Ramu", "9999999989", 23);
		return new Employee[] { employee, employee2, employee3 };
	}

}
