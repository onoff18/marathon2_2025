package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String path = "JavaMarathon2021\\src\\main\\resources\\For14DayTask10numbers2.txt";

        File file = new File(path);

        printResult(file);

    }

    public static void printResult(File file) {

        double sumElements = 0;
        int numberOfElements = 0;

        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {

                for (String number : scanner.nextLine().split(" ")) {
                    sumElements += Integer.parseInt(number);
                    numberOfElements++;
                }
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NullPointerException e) {
            System.out.println("Файл пустой");
        }

        System.out.printf(Locale.US, "%.15f", sumElements / numberOfElements);
        System.out.printf(" --> %.3f", sumElements / numberOfElements);

    }
}


