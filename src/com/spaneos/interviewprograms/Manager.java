package com.spaneos.interviewprograms;

public class Manager {
		public static void main(String[] args) {
				int num=1256;
				boolean prime=IProgramms.isPrime(num);
				if(prime)
					System.out.println("Is prime Number");
				else
					System.out.println("Not a prime number");
				System.out.println(IProgramms.isPalindrome(new char[]{'a','b','b','a','a'}));
		}
}
