package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberFloors = scanner.nextInt();

        if (numberFloors < 1){
            System.out.println("Ошибка ввода");
        } else if (numberFloors < 5){
            System.out.println("Малоэтажный дом");
        } else if (numberFloors > 8){
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Среднеэтажный дом");
        }

    }
}
