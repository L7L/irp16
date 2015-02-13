package com.spaneos.interviewprograms;

public final class IProgramms {
	private IProgramms() {
	}

	public static int factorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}

	public static  boolean isPrime(int num) {
		boolean prime = true;
		if (num > 1) {
			for (int i = 2; i <= num/2; i++) {
				if (num % i == 0) {
					prime = false;
					break;
				}
			}
		} else {
			prime = false;
		}
		return prime;
	}

	public static boolean isPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while (num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		return (temp == rev);
	}

	public static boolean isPalindrome(char arr[]){
			
			for(int i=0,j=arr.length-1;i<=arr.length/2;i++,j--){
					if(arr[i]!=arr[j])
						return false;
			}
			return true;
	}
}
