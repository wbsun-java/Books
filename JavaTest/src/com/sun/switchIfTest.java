package com.sun;
import java.util.Scanner;


public class switchIfTest {

	@SuppressWarnings({"resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner roleInput = new Scanner(System.in);
		System.out.println("Enter your role:");
		
		String role = roleInput.nextLine().toUpperCase();
		//String roleOutput = role == "admin"? "You are an admin.": "You are a guest.";
		//System.out.println(roleOutput);

		System.out.println(role);
		if (role.equals("ADMIN")) 
			System.out.println("You are an ADMIN!");
		else if (role.equals("MODERATOR"))
			System.out.println("You are a MODERATOR!");
		else
			System.out.println("You are a guest.");
		
		
		switch (role) {
			case "ADMIN":
			System.out.println("you are an admin.");
			break;
			
			case "MODERATOR":
			System.out.println("you are a moderator.");
			break;
			
			default:
			System.out.println("you are a guest.");
			
		}
	}

}
