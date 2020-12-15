package com.sun;


import java.util.Scanner;


public class helloWorld {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.print("Enter your sentence: ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		Variable p = new Variable();
		p.rintNextLine(s);
		
		String convertString = s.substring(0,1).toUpperCase();
		String CapString = convertString + s.substring(1);
		for (int i = 5; i >= 0; i --)
			System.out.println(CapString);		
		helloWorld P = new helloWorld();
		P.Rint("Try this one!");		
	}
	
	
	public void Rint(String s) {
		System.out.println(s);
	}
}
