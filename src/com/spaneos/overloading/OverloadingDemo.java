package com.spaneos.overloading;

import java.io.IOException;

class SumDemo {
	/*public int getSum(int a, int b) {
		System.out.println("1");
		return a + b;
	}*/

	public int getSum(char a, int b) {
		System.out.println("2");
		return a + b;
	}
	public double getSum(float a,float b){
		System.out.println("1");
		return a+b;
	}
	public long getSum(long a, long b) {
		System.out.println("3");
		return a + b;
	}
	public void PrintClassName(Number obj){
			System.out.println(obj.getClass().getName());
	}
	/*
	 * public String getSum(String a,String b){ return a+b; } public double
	 * getSum(double a,double b){ return a+b; }
	 */
}

public class OverloadingDemo {
	public static void main(String[] args) {
		SumDemo obj = new SumDemo();
		System.out.println(obj.getSum(31l,23l ));
		obj.PrintClassName(new Integer(100));
	}
}
