package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nums [] = new int[scanner.nextInt()];
        int moreThanEight = 0;
        int equalsOne = 0;
        int countEvens = 0;
        int countOdds = 0;
        int sumAllElements = 0;


        for (int i = 0; i < nums.length; i++) {
            nums[i] = randomNum(10);
        }

        System.out.println(Arrays.toString(nums));

        for (int num : nums){
            if (num > 8){
                moreThanEight++;
            }

            if (num == 0){
                equalsOne++;
            }

            if (num % 2 == 0) {
                countEvens++;
            } else {
                countOdds++;
            }

            sumAllElements += num;
        }

        System.out.printf("Длина массива - %d\nКоличестве чисел больше 8 - %d\n" +
                "Количество чисел равных 1 - %d\nКоличество четных чисел - %d\n" +
                "Количество нечетных чисел - %d\n" +
                "Сумма всех элементов массива - %d\n",
                nums.length, moreThanEight, equalsOne, +
                countEvens, countOdds, sumAllElements);
    }
    public static int randomNum (int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static int randomNum (int max){
        return (int)(Math.random() * (max + 1));
    }

}

