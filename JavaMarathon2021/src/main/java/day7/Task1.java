package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Yak",1950, 100, 100);
        Airplane airplane2 = new Airplane("Tu",1950, 200, 100);
        Airplane airplane3 = new Airplane("Mig",1950, 200, 100);

        Airplane.compareAirplanes(airplane2,airplane1);
        Airplane.compareAirplanes(airplane1,airplane2);
        Airplane.compareAirplanes(airplane3,airplane2);

    }
}