package com.spaneos.ems;

public class EmployeeContainer {
	private Employee employee[];

	public EmployeeContainer() {
		Employee emp1 = new Employee("Rajesh", "rajesh@spaneos.com", 34000);
		Employee emp2 = new Employee("Suresh", "suresh@spaneos.com", 54000);
		Employee emp3 = new Employee("Mahesh", "mahesh@spaneos.com", 74000);
		Employee emp4 = new Employee("Jayesh", "jayesh@spaneos.com", 44000);
		Employee emp5 = new Employee("Naresh", "naresh@spaneos.com", 84000);
		Employee emp6 = new Employee("Ramesh", "ramesh@spaneos.com", 24000);
		Employee emp7 = new Employee("Rakesh", "rakesh@spaneos.com", 14000);
		Employee emp8 = new Employee("Kamesh", "kamesh@spaneos.com", 74000);
		Employee emp9 = new Employee("Brijesh", "brijesh@spaneos.com", 54000);
		Employee emp10 = new Employee("Mukesh", "mukesh@spaneos.com", 74000);
		Employee emp11 = new Employee("Dinesh", "dinesh@spaneos.com", 54000);
		employee = new Employee[] { emp1, emp2, emp3, emp4, emp5, emp6, emp7,
				emp8, emp9, emp10, emp11 };
	}

	public Employee getMaxSalaryEmployee() {
		Employee emp = null;
		double max = employee[0].getSalary();
		for (int i = 1; i < employee.length; i++) {
			if (max < employee[i].getSalary()) {
				max = employee[i].getSalary();
			}
		}
		int pos = getEmployeeIndex(max);
		emp = employee[pos];
		return emp;
	}

	public Employee getMinSalaryEmployee() {
		Employee emp = null;
		double min = employee[0].getSalary();
		for (Employee e : employee) {
			if (min > e.getSalary()) {
				min = e.getSalary();
			}
		}
		emp = employee[getEmployeeIndex(min)];
		return emp;
	}

	public Employee[] getEmployees(double salary) {
		Employee emp[] = null;
		int count = getCount(salary);
		if (count > 0) {
			emp = new Employee[count];
			for (int i = 0, j = 0; i < employee.length; i++) {
				if (employee[i].getSalary() >= salary) {
					emp[j] = employee[i];
					j++;
				}
			}
			return emp;
		}
		return new Employee[] {};
	}

	private int getCount(double salary) {
		int count = 0;
		for (Employee emp : employee) {
			if (emp.getSalary() >= salary) {
				count++;
			}
		}
		return count;
	}

	private int getEmployeeIndex(double salary) {
		for (int i = 0; i < employee.length; i++) {
			if (employee[i].getSalary() == salary)
				return i;
		}
		return 0;
	}

}
