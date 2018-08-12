package chapter1;

public class Unit15_ClassesAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.name = "Matthew";
		person1.age = 39;
		
		person2.name = "Johuya";
		person2.age = 28;
		System.out.println("Hello I am "+person1.name+" I am "+person2.age);
		

	}

}

class Person{
	String name;
	int age;
}
