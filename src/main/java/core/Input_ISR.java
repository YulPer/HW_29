package core;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.IOException;

public class Input_ISR {
	public static void main(String []args) throws IOException{
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter your first name: ");
	String fn = br.readLine();
	System.out.println("Enter your last name: ");
	String ln = br.readLine();
	System.out.println("Your full name is: " + fn +" "+ ln);
	br.close();
	}
}
