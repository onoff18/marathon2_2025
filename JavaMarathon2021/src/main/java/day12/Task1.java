package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Audi", "BMW", "Lada", "Tesla", "Lada"));
        list.add(3, "Volga");

        System.out.println(list);

    }
}
