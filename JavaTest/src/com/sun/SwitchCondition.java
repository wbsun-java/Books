package com.sun;
import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner inputValue = new Scanner(System.in);
		System.out.print("Enter a number here: ");
		int value = inputValue.nextInt();

		if (value % 5 == 0 && value % 3 == 0)
			System.out.println("FizzBuzz");
		else if (value % 5 == 0)
			System.out.println("Fizz");
		else if (value % 3 == 0)
			System.out.println("Buzz");
		else
			System.out.println(value);
		
		for (int i = 0; i < 5; i++)
			System.out.println("Hello World " + i);
		
		int i = 5;
		while(i > 0) {
			System.out.println(i);
			i--;
			

		}
	}
	

}
