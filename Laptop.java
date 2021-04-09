package Exercise2_3;
import java.util.*;
import java.util.Scanner;

public class Laptop {

	Scanner s = new Scanner(System.in);

	void laptopPreferrence() {
		System.out.println("Enter Brand and Model you prefer :");
		s.nextLine();
		String b = s.next();
		String m = s.nextLine();
		
		System.out.println("Your Brand : " + b);
		System.out.println("Your Model : " + m);
	}
	
	 void totalPrice() {
		System.out.print("Enter the laptop price : ");
		int p = s.nextInt();
		System.out.print("Enter the quantity of laptop : ");
		int q = s.nextInt();
	    int T = q * p;
		System.out.println("Total Price of " + q + " units :" + "RM"+ T);
	}
	
	void discPrice() {
		System.out.print("Enter the laptop price : ");
		double p = s.nextDouble();
		System.out.print("Enter the quantity of laptop : ");
		double q = s.nextDouble();
	    double T = q * p;
		System.out.print("Enter the discount amount (%) : ");
		double d = s.nextDouble();
		double dp = d/100;
		double disc = T - (T*dp);
		System.out.println("Discounted Price of " + q + " units :" + "RM"+ disc);
	}
	
	void service() {
		System.out.println("How do you rate our service? ");	
		System.out.println("A (Satisfied) ");
		System.out.println("B (Moderate) ");
		System.out.println("C (Not satisfied) ");
		System.out.println("Your choice : ");
		char ss = s.next().charAt(0);
		System.out.println("Your choice is : " + ss);
		System.out.println("Thank you and come again!");
	}
}
