package day16;

import day4.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String path1000 = "JavaMarathon2021\\src\\main\\resources\\1000numbers.txt";
        String path50 = "JavaMarathon2021\\src\\main\\resources\\50numbers.txt";

        File file1 = new File(path1000);
        File file2 = new File(path50);

        try {
            PrintWriter printWriter = new PrintWriter(file1);
            PrintWriter printWriterFiftyDigits = new PrintWriter(file2);
            int count = 0;
            double averageValue = 0;

            for (int i = 0; i < 1000; i++) {
                int number = Task1.randomNum(100);

                printWriter.printf("%d ", number);
                printWriter.flush();

                averageValue += number;
                count++;

                if (count == 20) {
                    printWriterFiftyDigits.printf(Locale.US, "%f ", averageValue / 20);
                    averageValue = 0;
                    count = 0;
                }
            }

            printWriter.close();
            printWriterFiftyDigits.close();

        } catch (IOException e) {
            System.out.println("Ошибка записи");
        }

        printResult(file2);
    }

    public static void printResult(File file) {

        double sumDigits = 0;

        try {
            Scanner scanner = new Scanner(file);


            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                for (String number : line.split(" ")) {
                    sumDigits += Double.parseDouble(number);
                }
            }

            System.out.println((int) sumDigits);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
