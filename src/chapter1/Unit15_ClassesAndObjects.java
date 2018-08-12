package chapter1;

public class Unit15_ClassesAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Person 1
		Person person1 = new Person();
		person1.setName("Vasyl");
		person1.setAge(36);
		//Person 2
		Person person2 = new Person();
		person2.name = "Johuya";
		person2.age = 28;
		person1.speak();
		//person2.sayHello();
		
		

	}

}

class Person{
	String name;
	int age;
	
	void setName(String username) {
		name = username;
		}
	
	void setAge(int userage) {
		age = userage;
		}
	
	
	void speak() {
		System.out.println("Hello I am "+name+" I am "+age);
		}
	
	void sayHello() {
		System.out.println("Privet suchkes");
	}
	
	int getYearsToRetired() {
		int years = 65 - age;
		return years;
	}
}
