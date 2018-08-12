package chapter1;



public class Unit11_arrays {
	public static void main(String [] args) {
		
		int[] numbers = new int[5];
		for (int i=0; i <numbers.length; i++) {
			numbers[i] = i* 10;
			System.out.println("huak  " + i);
		}
		
		for (int i=0; i <numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		int[] numbers2 = {1,2,3};   //initiazlizaton of arrays in derictive 
		for (int i=0; i <numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}
		
	}

}
