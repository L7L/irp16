package com.spaneos.overloading;

public class Summator {
	
	public int getSum(int a, int b) {
		System.out.println("sum method with 2 parameters");
		return a + b;
	}

	public int getSum(int a, int b, int c) {
		System.out.println("sum method with 3 parameters");
		return a + b + c;
	}

	public int getSum(int a, int b, int c, int d) {
		System.out.println("sum method with 4 parameters");
		return a + b + c + d;
	}

	public int getSum(int... a) {
		System.out.println("sum method with var args ");
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}

}
