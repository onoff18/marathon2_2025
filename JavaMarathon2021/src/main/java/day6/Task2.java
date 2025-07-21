package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boing", 2020, 1, 1);

        airplane.setWeight(320000);
        airplane.setLength(74);

        airplane.fillUp(100);
        airplane.fillUp(150);

        airplane.info();

    }
}
