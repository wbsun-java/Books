package com.sun;

import java.util.Scanner;

public class doWhileFor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputName ="";

		while (true) {
			System.out.print("Name:");
			inputName = scanner.next().toLowerCase();
			if (inputName.equalsIgnoreCase("pass"))
				continue;
			if (inputName.equals("quit"))
				break;
			System.out.println(inputName);
		}
	}

}
