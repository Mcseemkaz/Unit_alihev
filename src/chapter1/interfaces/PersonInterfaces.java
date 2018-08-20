package chapter1.interfaces;

public class PersonInterfaces implements Info{
    public String name;

    public PersonInterfaces(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello mather suckerss!!!");
    }
    public void showInfo(){
        System.out.println("My name is "+this.name);
    }

}
