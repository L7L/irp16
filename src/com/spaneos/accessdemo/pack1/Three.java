package com.spaneos.accessdemo.pack1;

public class Three {
	public void show() {
		One obj = new One();
		//System.out.println("Private :" + obj.pri_a);
		System.out.println("Public :" + obj.pub_a);
		System.out.println("Protected :" + obj.pro_a);
		System.out.println("Default :" + obj.def_a);
	}
}
