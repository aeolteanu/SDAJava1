package oop.inheritance;

public class Cat extends Animal {


    public void purr() {
        System.out.println("The cat is purring");

    }

    @Override
    public void eat() {
        System.out.println("The cat is eating");

    }

    @Override
    public void makeSound() {
        System.out.println("Miau miau");
    }
    public void purr(String catName){
        System.out.println(catName + " is purring");

    }
}
