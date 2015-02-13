package com.spaneos.overloading;

public class Manager {
	public static void main(String... args) {
		Summator obj=new Summator();
		System.out.println(obj.getSum(4591, 5419));
		
		System.out.println(obj.getSum(1, 2,6));
		System.out.println(obj.getSum(1, 2,6,2));
		System.out.println(obj.getSum(1,2,3,4,5,6));
		System.out.println(obj.getSum(1, 2,3,4,4,5,6,7,8));
		System.out.println(obj.getSum(new int[]{1, 2,3,4,4,5,6,7,8,9}));
		System.out.println(obj.getSum(1));
	}
}
