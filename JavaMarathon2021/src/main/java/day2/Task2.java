package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");

        } else {

            for (int i = a + 1; i < b; i++) {

                if (Math.abs(i % 10) == 5) {
                    System.out.printf("%d ", i);
                }
            }

        }
    }
}
