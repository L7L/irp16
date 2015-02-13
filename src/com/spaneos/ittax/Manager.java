package com.spaneos.ittax;

public class Manager {
	public static void main(String[] args) {
		
		ItTaxCalculator arr[] = getTaxPayerInformation();
		viewTaxPayerInformation(arr);
	}

	private static void viewTaxPayerInformation(ItTaxCalculator[] arr) {
			for(ItTaxCalculator obj:arr){
				obj.showTaxInformation();
			}
	}

	private static ItTaxCalculator[] getTaxPayerInformation() {
		ItTaxCalculator obj1 = new ItTaxCalculator("Rajesh", 500000, 200000);
		ItTaxCalculator one = new ItTaxCalculator("Manoj", 800000, 400000);
		ItTaxCalculator two = new ItTaxCalculator("Balu", 1000000, 500000);
		ItTaxCalculator obj2 = new ItTaxCalculator("Ramesh", 1400000, 500000);
		ItTaxCalculator obj3 = new ItTaxCalculator("Siva", 1200000, 500000);
		ItTaxCalculator obj4 = new ItTaxCalculator("Sivanji", 300000, 100000);
		ItTaxCalculator arr[] = new ItTaxCalculator[] { obj1, one, two, obj2,
				obj3, obj4 };
		return arr;
	}
}
