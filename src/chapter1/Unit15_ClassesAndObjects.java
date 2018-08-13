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
		person1.speak();
		//person2.sayHello();
		
		}

}

class Person{
	private String name;
	private int age;
	
	public void setName(String username) {
		name = username;
		}
	public String getName() {
		return name;
	}
	
	
	public void setAge(int userage) {
		age = userage;
		}
	
	public int getAge() {
		return age;
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
