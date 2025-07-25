package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String path = "JavaMarathon2021\\src\\main\\resources\\people.txt";
        File file = new File(path);

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {

        List<String> humans = new ArrayList<>();

        try {

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                if (Integer.parseInt(line.split(" ")[1]) < 0) {
                    humans.clear();
                    throw new IllegalArgumentException();
                }

                humans.add(line);
            }


        } catch (
                FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (
                IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return humans;

    }
}
