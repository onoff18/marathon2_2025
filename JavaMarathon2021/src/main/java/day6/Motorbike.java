package day6;

public class Motorbike {

    private final String color;
    private final String model;
    private final int year;

    public Motorbike(String color, String model, int yearOfProduction) {
        this.model = model;
        this.color = color;
        this.year = yearOfProduction;
    }

    /*
    getColor и getModel использовались для теста в предыдущем дне.
    Надо ли оставлять неиспользуемые методы текущем задание??
    */
    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(this.year - inputYear);
    }
}
