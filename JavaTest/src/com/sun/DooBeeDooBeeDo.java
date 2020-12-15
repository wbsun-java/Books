package com.sun;

public class DooBeeDooBeeDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable p = new Variable();
		int i = 0;
		while (i < 3) {
			p.rintNextLine("Doo");
			p.rintNextLine("Bee");
			i = i + 1;
		}
		if (i == 3)
			System.out.print("Do");
	}

}
