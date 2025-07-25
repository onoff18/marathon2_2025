package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String path = "JavaMarathon2021\\src\\main\\resources\\For14DayTask10numbers.txt";
        File file = new File(path);

        printSumDigits(file);

    }

    public static void printSumDigits(File file) {

        int sum = 0;
        int countNumbers = 0;

        try {

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                for (String number : scanner.nextLine().split(" ")) {
                    sum += Integer.parseInt(number);
                    countNumbers++;
                }
            }

            if (!(countNumbers == 10)) {
                throw new IOException();
            }

            System.out.println(sum);

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
