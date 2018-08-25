package chapter1.Upcasting_downcasting;

import java.util.ArrayList;
import java.util.List;

public class Unit33_Upcasting_downcasing {

    public static void main(String[] args){

        int x = (int)123.5; //явное приведение примитивных типов
        long y = 12345568948989L; //неявное приведение примитивных типов - добавляем в конец значения либо L - long F - float

        List list = new ArrayList();
        list.add("Dogs");
        list.add("Animal3");
        list.add("Murplop");

        String listOne = (String) list.get(1);  //пример приведения типа в стринг из обїекта
        System.out.println(listOne);

        /////////////// Использование Дженериков /////////////

        List<String> list2 = new ArrayList<String>();
        list2.add("Dogs_2");
        list2.add("Anomal_2");
        list2.add("Murplop_2");
        String listTwo = list2.get(2);
        System.out.println(listTwo);

        /////////// Java 7 Generic ///////////
        List<String> list3 = new ArrayList<>();
        list3.add("Dogs_3");
        list3.add("Anomal_2");
        list3.add("Murlop_3");

        String listThree = list3.get(2);
        System.out.println(listThree);


    }
}
