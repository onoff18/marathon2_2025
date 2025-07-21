package day6;

public class Car {

    private String color;
    private String model;
    private int year;

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
