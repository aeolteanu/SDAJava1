package oop.advanced.exceptions;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
//            String text = null;
//            text.toString();
//            int x = 5 / 0;
            int[] array = {5,7};
            int index = 3;

            printArrayElements(array, index);

        } catch (ArithmeticException arithmeticException) {
            System.out.println("Aritmethic exception " + arithmeticException.getMessage());
        }  finally {
            System.out.println("This will be prited no matter what the value is");
        }
    }

    public static void printArrayElements(int[] array, int index) throws Exception {
        if (index < 0 || index >= array.length){
            throw new MyException("Incorect index value");
        }
        System.out.println(array[index]);

    }

}
