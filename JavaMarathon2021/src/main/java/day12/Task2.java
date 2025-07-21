package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        addEvenNum(list, 0, 30);
        addEvenNum(list, 300,350);

        System.out.println(list);


    }
    public static void addEvenNum(List<Integer> list, int start, int finish) {

        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
    }
}
