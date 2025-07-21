package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        double dividend;
        double divisor;
        int numberIterations = 0;

        Scanner scanner = new Scanner(System.in);


        while (numberIterations < 5) {
            dividend = scanner.nextDouble();
            divisor = scanner.nextDouble();
            numberIterations++;

            if (divisor == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println(dividend / divisor);
        }

    }
}
