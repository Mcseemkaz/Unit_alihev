package chapter1;
import java.util.*;

public class Unit7_Scaner {
	
	public static void main(String[] args) {
		
		Scanner arge = new Scanner(System.in); // create  a new object scanner class and give as argument typical standard source input as a consolle
		
		System.out.println("Please input your Bio Profile");
		System.out.print("Please input your Name   :");
		String name = arge.nextLine();
		System.out.print("Please input your age   :");
		int age = arge.nextInt();
		System.out.print("You have inputed "+name+"  "+age);
		
		
		
	}

}
