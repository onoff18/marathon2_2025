package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        String path = "JavaMarathon2021\\src\\main\\resources\\people.txt";

        File file = new File(path);

        System.out.println(parseFileToObjList(file));


    }

    public static List<Person> parseFileToObjList(File file) {

        List<Person> persons = new ArrayList<>();

        try {


            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                if (Integer.parseInt(line.split(" ")[1]) < 0) {
                    persons = null;
                    throw new IllegalArgumentException();
                }

                persons.add(new Person(line.split(" ")[0], Integer.parseInt(line.split(" ")[1])));
            }


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return persons;

    }
}
