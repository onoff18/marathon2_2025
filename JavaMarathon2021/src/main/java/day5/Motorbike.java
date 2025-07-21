package day5;

public class Motorbike {

    private final String color;
    private final String model;
    private final int yearOfProduction;

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
