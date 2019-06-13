package core;

import java.util.Scanner;

public class Input_Scanner {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter your first name: ");
		String fn = s.nextLine();
		System.out.println("Enter your last name: ");
		String ln = s.nextLine();
		System.out.println("Your full name is: " + fn +" "+ ln);
		s.close();
		}
}
