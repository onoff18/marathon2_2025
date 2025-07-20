package day4;

public class Task2 {
    public static void main(String[] args) {

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int numberArrayElementsEndingZero = 0;
        int sumArrayElementsEndingZero = 0;

        int nums [] = new int[100];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Task1.randomNum(10000);
        }

        for (int num : nums){
            if (num % 10 == 0){
                numberArrayElementsEndingZero++;
            }

            if (num > maxValue){
                maxValue = num;
            }

            if (num < minValue){
                minValue = num;
            }
            sumArrayElementsEndingZero += num;
        }

        System.out.printf("Наибольший элемент массива - %d\n" +
                "Наименьший элемент массива - %d\n" +
                "Количество элементов массива, оканчивающихся на 0 - %d\n" +
                "Сумма элементов массива, оканчивающихся на 0 - %d\n",
                maxValue, minValue, numberArrayElementsEndingZero, sumArrayElementsEndingZero);

    }
}
