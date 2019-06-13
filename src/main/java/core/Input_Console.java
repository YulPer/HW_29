package core;
import java.io.Console;
import java.util.Scanner;

public class Input_Console {
	public static void main(String[] args) {
		Console c =  System.console();
		
		if (c == null){ System.err.println("Console is not available"); System.exit(0);}
		// System.out.println("Enter your first name: ")
		
		String fn = c.readLine("Enter your first name: ");
		String ln = c.readLine("Enter your last name: ");
		System.out.println("Your full name is: " + fn +" "+ ln);
		}
}
