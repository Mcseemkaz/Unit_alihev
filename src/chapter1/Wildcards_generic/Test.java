package chapter1.Wildcards_generic;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args){

        List<Animal3> listOfAnimal3 = new ArrayList<>();
        listOfAnimal3.add(new Animal3(23));
        listOfAnimal3.add(new Animal3(24));
        listOfAnimal3.add(new Animal3(90));

        List<Dog3> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog3());
        listOfDogs.add(new Dog3());

        test(listOfAnimal3);
        test(listOfDogs);

    }


    private static void test(List<? extends Animal3> list){   /// ? заменяет тип класса .. super как наследование только вверх
        for(Animal3 animal3 :list) System.out.println(animal3);

    }
}
