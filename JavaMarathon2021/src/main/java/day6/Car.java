package day6;

public class Car {

    private String color;
    private String model;
    private int year;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(this.year - inputYear);
    }
}
