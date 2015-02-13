package com.spaneos.accessdemo.pack1;

public class One {
	private int pri_a = 10;
	public int pub_a = 20;
	int def_a = 30;
	protected int pro_a = 40;

	public void show() {
		System.out.println("Private :" + pri_a);
		System.out.println("Public :" + pub_a);
		System.out.println("Protected :" + pro_a);
		System.out.println("Default :" + def_a);
	}

}
