package chapter1.Wildcards_generic;

public class Animal3 {

    private int id;

    Animal3() {
    }

    Animal3(int id){
        this.id = id;
    }
    public String toString(){

        return String.valueOf(id);
    }

    public void eatAnimal3(){
        System.out.println("Animal3 is eating method implemented...");
    }

}
