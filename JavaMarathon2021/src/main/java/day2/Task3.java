package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        }

        a++;

        while (a<b){
            if (Math.abs(a % 10) == 5) {
                System.out.printf("%d ", a);
            }
            a++;
        }
    }
}
