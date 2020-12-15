package com.sun;

import java.text.NumberFormat;
import java.util.Scanner;


public class MorgageCalculator {

	public static void main(String[] args) {

		int month_in_year = 12;
		int percent = 100;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		double principal = 0;
		
		double annualInterest = 0;
		double monthlyInterest = 0;

		int years = 0;
		int numberOfPayment = 0;
		
		while(true) {
			System.out.print("Principal: ");
			principal = scanner.nextDouble();
			if (principal >= 1000 && principal <= 1_000_000_000)				
				break;
			System.out.print("Enter the number between 1000 and 1,000,000,000: ");
		}
		
		while(true) {
			System.out.print("Annual Inerest Rate: ");
			annualInterest = scanner.nextDouble();
			monthlyInterest = annualInterest / month_in_year / percent;
			if (annualInterest > 0 && annualInterest < 5)				
				break;
			System.out.println("Enter the number between 0 and 5: ");
		}
		
		while(true) {
		System.out.print("Period (Year): ");
		years = scanner.nextInt();
		numberOfPayment = years * month_in_year;
		if (years >= 1 && years <= 30)
			break;
		System.out.println("Enter the number between 1 and 30: ");
		}
		
		double morgage = principal * 
									(monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment)) 
									/ 
									(Math.pow(1 + monthlyInterest, numberOfPayment) - 1);
		
		String morgageFormatted = NumberFormat.getCurrencyInstance().format(morgage);
		System.out.println("Morgage: " + NumberFormat.getCurrencyInstance().format(morgage));
		System.out.println("Try again, the monthyly payment of the morgage is " + morgageFormatted);
		
		
		
	}

}
