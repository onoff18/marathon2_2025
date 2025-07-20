package day6;

public class Motorbike {

    private String color;
    private String model;
    private int year;

    public Motorbike(String color, String model, int yearOfProduction) {
        this.model = model;
        this.color = color;
        this.year = yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(this.year - inputYear);
    }
}
