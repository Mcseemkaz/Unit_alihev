package chapter1;

public class Unit19_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human();
		human1.setName("Ginger");
		human1.setAge(34);
		human1.getInfo();
		
	}

}

class Human{
	
	public String name;
	public int age;
	
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
		}
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	public void getInfo() {
		System.out.println(name+","+age);
	}
}
