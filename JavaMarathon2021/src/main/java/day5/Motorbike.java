package day5;

public class Motorbike {

    private String color;
    private String model;
    private int yearOfProduction;

    public Motorbike(String color, String model, int yearOfProduction) {
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
