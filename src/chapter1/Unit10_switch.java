package chapter1;

import java.util.Scanner;

public class Unit10_switch {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter some digit:  ");
		int age = scanner.nextInt();
		switch(age){  //String also avialable on Java 7 
		case 0:
			System.out.println("Fuck! you are ziro");
			break;
		case 7:
			System.out.println("Fuck yeah you are scool guy");
			break;
		case 100:
			System.out.println("Fuck you are awesome 100" );
		default:
			System.out.println("You are not the same person as we knew");
		
		}
		
	}

}
