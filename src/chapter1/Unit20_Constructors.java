package chapter1;

public class Unit20_Constructors{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanNew human1 = new HumanNew("Tolik", 32);
		human1.getInfo();
		
	}

}

class HumanNew {
	
	public String name;
	public int age;
	
	
	public HumanNew() {
		this.name = "Valera";
		this.age = 39;
		}
	public HumanNew(String name) {
		this.name = name;
		this.age = 39;
	}
	
	public HumanNew(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
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
