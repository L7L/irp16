package com.spaneos.overloading;

public class MaxSalary {
	public static void main(String[] args) {
		String data[]=args[0].split(",");
		int salarr[] = new int[data.length];
		int i = 0;
		for (String d : data) {
			salarr[i++] = Integer.parseInt(d);
		}
		System.out.println("Max Salary :" + maxSalary(salarr));
		System.out.println("Min Salary :" + minSalary(salarr));
	}

	public static int maxSalary(int... salary) {
		int maxsalary = salary[0];
		for (int i = 1; i < salary.length; i++) {
			if (maxsalary < salary[i])
				maxsalary = salary[i];
		}
		return maxsalary;
	}

	public static int minSalary(int... salary) {
		int minsalary = salary[0];
		for (int i = 1; i < salary.length; i++) {
			if (minsalary > salary[i])
				minsalary = salary[i];
		}
		return minsalary;
	}
}
