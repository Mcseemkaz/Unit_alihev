package chapter1.interfaces;

public class TestInterfaces{

    public static void main(String[] args) {

        /*
        AnimalInterfaces animal1 = new AnimalInterfaces(10);
        PersonInterfaces person1 = new PersonInterfaces("Vasya");
        animal1.showInfo();
        person1.showInfo();
        */


        /*
        Info info1 = new AnimalInterfaces(89);
        Info info2 = new PersonInterfaces("Vasyalka");
        info1.showInfo();
        info2.showInfo();
        */
        /*
        Info info1 = new AnimalInterfaces(89);
        Info info2 = new PersonInterfaces("Vasyalka");
        outputInfo(info1);
        outputInfo(info2);
        */
        AnimalInterfaces animal1 = new AnimalInterfaces(10);
        PersonInterfaces person1 = new PersonInterfaces("Vasya");
        outputInfo(animal1);
        outputInfo(person1);

    }
    public static void outputInfo(Info info){
        info.showInfo();
                   }




}
