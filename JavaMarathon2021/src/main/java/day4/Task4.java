package day4;

public class Task4 {
    public static void main(String[] args) {

        int nums [] = new int[100];
        int maxSumThreeElement = Integer.MIN_VALUE;
        int indexFirstElementMaxSumThreeElement = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Task1.randomNum(10000);
        }

        for (int i = 0; i < nums.length - 2; i++) {
            int sumThreeElement;
            sumThreeElement = nums[i] + nums[i + 1] + nums[i + 2];

            if (sumThreeElement > maxSumThreeElement){
                maxSumThreeElement = sumThreeElement;
                indexFirstElementMaxSumThreeElement = i;
            }
        }

        System.out.printf("Максимум среди сумм трех соседних элементов - %d\n" +
                "Индекс первого элемента тройки с максимальной суммой - %d",
                maxSumThreeElement, indexFirstElementMaxSumThreeElement);
    }
}
