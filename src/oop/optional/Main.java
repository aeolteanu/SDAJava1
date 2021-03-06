package oop.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> stringEmptyOptional1 = Optional.empty();
        System.out.println(stringEmptyOptional1.isPresent());

        String name = null;
        Optional<String> stringNameOptional = Optional.ofNullable(name);
        if (stringNameOptional.isPresent()) {
            System.out.println(stringNameOptional
                    .get());
        }
        System.out.println("****************");
        String name1 = "Ana";
        Optional<String> stringNameOptional1 = Optional.ofNullable(name1);
        if (stringNameOptional1.isPresent()) {
            System.out.println(stringNameOptional1
                    .get());
        }

        System.out.println("****************");
        String name2 = null;
        Optional<String> stringNameOptional3 = Optional.ofNullable(name2);
        stringNameOptional3.orElse("default");
        if (stringNameOptional.isPresent()) {
            System.out.println(stringNameOptional3
                    .get());

        }else {
            System.out.println(stringNameOptional3.orElse("default"));
        }

    }
}

