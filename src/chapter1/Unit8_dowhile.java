package chapter1;

import java.util.Scanner;

public class Unit8_dowhile {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		int value;
		int myTryed =0;
		do {
			System.out.print("Input a numer xaxa   :");
			value = scanner.nextInt();
			myTryed ++;
		}while(value !=5);
		
		System.out.println("Your inputed a " + value+ "and quantity of your tries are -"+myTryed);
		
		
	}

}
