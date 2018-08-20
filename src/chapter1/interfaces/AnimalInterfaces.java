package chapter1.interfaces;

public class AnimalInterfaces implements Info{
    public int id;

    public AnimalInterfaces(int id){
        this.id = id;
    }
    public void sleep(){
        System.out.println("I'm sleeping now! Mumi");
    }
    public void showInfo(){
        System.out.println("My id is "+this.id);

    }
}
