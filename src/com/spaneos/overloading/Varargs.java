package com.spaneos.overloading;

public class Varargs {
		public static void main(String[] args) {
			System.out.println(biggest(1,2,3));
			System.out.println(biggest(5,6,3,4,5,6));
			System.out.println(biggest(new int[]{3,4,5,6,7,8,99,109,10,20}));
		}
		
		public static int biggest(int... a){
				int big=a[0];
				for(int i=1;i<a.length;i++){
						if(big<a[i])
							big=a[i];
				}
				return big;
		}
}
