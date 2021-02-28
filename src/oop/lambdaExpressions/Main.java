package oop.lambdaExpressions;

import oop.lambdaExpressions.AdultPersonTest;
import oop.lambdaExpressions.Person;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(30);

//        Example without lambda
        Predicate<Person> adultPersonTest = new AdultPersonTest();
        System.out.println(adultPersonTest.test(person));

//        Example with lambda
        Predicate<Person> adultPersonTest2 = person1 -> person1.getAge() > 18;
        System.out.println(adultPersonTest2.test(person));


//        Example with lambda runnable
        Runnable runnable = () -> System.out.println("Running in runnable");
        runnable.run();

//      Lambda expression method reference
        Predicate<Person> adultPersonTest3 = Person::isAdultNoParam;
        System.out.println(adultPersonTest3.test(person));

        Predicate<Person> adultPersonTest4 = person::isAdult;
        System.out.println(adultPersonTest4.test(person));

    }
}