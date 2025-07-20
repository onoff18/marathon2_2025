package day8;

public class Task1 {
    public static void main(String[] args) {

        String a = null;
        StringBuilder sb = new StringBuilder();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 200000; i++) {
            a += Integer.toString(i);
        }

        long stopTime = System.currentTimeMillis();

        System.out.printf("Длительность работы, в мс. - %d\n", stopTime - startTime);

        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 200000; i++) {
            sb.append(i);
        }

        long stopTime1 = System.currentTimeMillis();

        System.out.printf("Длительность работы, в мс. - %d\n", stopTime1 - startTime1);
    }
}
