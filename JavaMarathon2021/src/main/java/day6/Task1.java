package day6;

public class Task1 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike("синий", "Ява", 2010);

        System.out.println(motorbike.yearDifference(2035));
        motorbike.info();

    }
}
