package chapter1.polymorf;

public class Test {

    public static void main(String[] args) {

    Animal2 animal2 = new Animal2();
    Dog dog2 = new Dog();
    Cat cat2 = new Cat();

    eatttt(animal2);
    eatttt(dog2);
    eatttt(cat2);

    }

    private static void eatttt(Animal2 animal){
        animal.eat();
    }

}
