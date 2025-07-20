package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        double dividend;
        double divisor;

        Scanner scanner = new Scanner(System.in);


        while (true) {
            dividend = scanner.nextDouble();
            divisor = scanner.nextDouble();

            if (divisor == 0) {
                break;
            }

            System.out.println(dividend / divisor);
        }

    }
}
