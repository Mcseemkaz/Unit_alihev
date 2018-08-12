package chapter1;

import java.util.Random;

public class Unit12_for_each_arrays {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		String[] strings = new String[3];
		Random rand = new Random();
		
	
		for(int i =0 ;i<strings.length; i++) {
		
			strings[i] ="" + rand.nextInt();
			System.out.println(strings[i]);
			}
		System.out.println();
		
		
		for(String x:strings) {
			System.out.println(x);
			
		}
		
		// TODO Auto-generated method stub

	}

}
