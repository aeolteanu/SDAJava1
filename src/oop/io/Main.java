package oop.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File absolutFile = new File("C:/TEST/test.txt");
        File outputFile = new File("C:/TEST/output.txt");
        if (!outputFile.exists()) {

            outputFile.createNewFile();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(fileLine);
                bufferedWriter.append(fileLine);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("*******************************************");
        Path outputPath = Paths.get("C:/TEST/output.txt");
        List<String> myLines = Files.readAllLines(outputPath);
        System.out.println(myLines);


        Path outputPath1 = Paths.get("../../output2.txt" );

        if(!Files.exists(outputPath1)){
            Files.createFile(outputPath1);
        }
        Files.write(outputPath1, myLines);



//        File personFile = new File("C:/JAVA SDA curs/person.txt");
//
//        if(!personFile.exists()){
//            personFile.createNewFile();
//        }
//        Person person = new Person("Alex", "Olteanu");
//        System.out.println("Before Serialization : " + person);
//        try(FileOutputStream fileOutputStream = new FileOutputStream(personFile);
//        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream) ){
//            objectOutputStream.writeObject(person);
//
//            //reading and writing files
//        }
//        Person person1;
//
//        try(FileInputStream fileInputStream = new FileInputStream(personFile);
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
//            person1=(Person) objectInputStream.readObject();
//
//        }
//
//        System.out.println("After deserialization" + person1);
//
//
//
    }
}
