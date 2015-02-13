package com.spaneos.ittax;

public class ItTaxCalculator {
	private String fName;
	private double income;
	private double deductions;

	public ItTaxCalculator(String fName, double income, double deductions) {
		this.fName = fName;
		this.income = income;
		this.deductions = deductions;
	}

	private double getTaxAmount(double income, double deductions) {
		double taxAmount = 0.0d;
		if (income > deductions) {
			if (income > 0 && income <= 200000) {
				taxAmount = (income - deductions) * .05;
			} else if (income > 200000 && income <= 600000) {
				taxAmount = (income - deductions) * .1;
			} else if (income > 600000 && income <= 1000000) {
				taxAmount = (income - deductions) * .2;
			} else {
				taxAmount = (income - deductions) * .3;
			}
		}
		return taxAmount;
	}

	public void showTaxInformation() {
		System.out.println("Name       	:" + fName);
		System.out.println("income     	:" + income);
		System.out.println("Deductions  	:" + deductions);
		System.out.println("Tax Amount  	:" + getTaxAmount(income, deductions));
		System.out.println("\n-------------------------------------------\n");
	}

}
