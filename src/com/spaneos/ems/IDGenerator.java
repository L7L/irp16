package com.spaneos.ems;


public final class IDGenerator {
	private static int empno = 1001;

	private IDGenerator() {
	}

	static int getEmpno() {
		return empno++;
	}
}
