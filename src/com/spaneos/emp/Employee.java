package com.spaneos.emp;

public class Employee {
	private static int count=0;
	private int empno;
	private String ename;
	private int age;
	private String mobile;
	{
		count++;
	}
	public Employee(String ename) {
		this(ename,"Not provided");
	}

	public Employee(String ename, String mobile) {
		this(ename,mobile,0);
	}

	public Employee(String ename, String mobile, int age) {
		empno = IdGenerator.getEmpno();
		this.ename = ename;
		this.mobile = mobile;
		this.age = age;
	}

	public void display() {
		System.out.println(empno + "-" + ename + "-" + mobile + "-" + age);
	}

	public static int getCount() {
		return count;
	}

	
	

}
