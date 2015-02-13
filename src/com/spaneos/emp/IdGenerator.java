package com.spaneos.emp;

public final class IdGenerator {
public static int empno = 1001;

	private IdGenerator() {

	}
	public static int getEmpno() {
		return empno++;
	}
}
