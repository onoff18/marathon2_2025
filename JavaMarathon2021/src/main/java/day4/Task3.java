package day4;

public class Task3 {
    public static void main(String[] args) {

        int nums[][] = new int[12][8];
        int maxSumRow = Integer.MIN_VALUE;
        int columnNumberWithMaxSumRow = 0;

        for (int i = 0; i < nums.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = Task1.randomNum(50);
                sumRow += nums[i][j];
            }

            if (sumRow >= maxSumRow) {
                maxSumRow = sumRow;
                columnNumberWithMaxSumRow = i;
            }
        }

        System.out.printf("Индекс строки, сумма чисел в которой максимальна - %d",
                columnNumberWithMaxSumRow);
    }
}
