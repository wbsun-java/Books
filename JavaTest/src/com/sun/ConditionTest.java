package com.sun;

import java.util.Scanner;

public class ConditionTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

				//if condition

				Scanner scannerInput = new Scanner(System.in);
				System.out.print("Please enter today's temperature: ");
				double temperature = scannerInput.nextDouble();
				
				if (temperature >= 30) {
					System.out.println("It's a hot day!");
					System.out.println("Drink plenty of water!");
				} 
				else if (temperature >= 20) 
					System.out.println("it's a bueautiful day!");
				 
				else 
					System.out.println("it's a cold day!");
				
				String printTemp = temperature >= 30? "It's a hot day, drink plenty of water!" : "it's beautiful day";
				System.out.println(printTemp);
				

				System.out.print("Enter your income: ");
				double income = scannerInput.nextDouble();
				String incomeOutput = income >= 120_000? "You are a first class income.": "You are an economy class.";
				System.out.println(incomeOutput);
			}

}
