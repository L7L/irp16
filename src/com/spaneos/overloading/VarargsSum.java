package com.spaneos.overloading;

public class VarargsSum {
	public static void main(String[] args) {
		int a[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		showMatrix(a);
	}

	public static void showMatrix(int[]... a) {
		for (int i[] : a) {
			for (int j : i) {
				System.out.print(" " + j + " ");
			}
			System.out.println();
		}
	}
}
