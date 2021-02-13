package oop.inheritance;

public class Dog extends Animal {


    public void bark() {
        System.out.println("Ham ham!");
    }

    @Override
    public void eat() {
        System.out.println("The Dog is eating");

    }

    @Override
    public void makeSound() {
        System.out.println("ham ham");
    }
}

