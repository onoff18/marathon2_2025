package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        if (x >= 5) {
            System.out.println((Math.pow(x, 2) - 10) / (x + 7));
        } else if (x < -2) {
            System.out.println((double) 420);
        } else {
            System.out.println((x + 3) * (Math.pow(x, 2) - 2));
        }

    }
}
