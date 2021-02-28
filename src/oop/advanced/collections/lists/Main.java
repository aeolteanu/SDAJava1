package oop.advanced.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> counties = new ArrayList<>();
        counties.add("Teleorman");
        counties.add("Maramures");
        counties.add("Cluj");
        System.out.println(counties.indexOf("Cluj"));
        System.out.println(counties.size());
        System.out.println("After remove");
        counties.remove("Teleorman");
        System.out.println(counties.indexOf("Cluj"));
        System.out.println(counties.size());


        System.out.println("show list with classic for-----------------");
        System.out.println(counties);
        for (int i = 0; i < counties.size(); i++) {
            System.out.println(counties.get(i));
        }
        System.out.println("show list with foreach------------------");
        for (String element : counties) {
            System.out.println(element);

        }
        System.out.println("Show list with foreach-------------");
        counties.forEach(System.out::println);

        System.out.println("Show list with iterator------------");
        Iterator<String> iterator = counties.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
