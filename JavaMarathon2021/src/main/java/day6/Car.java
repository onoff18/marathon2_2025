package day6;

public class Car {


    /*
    Строки color и model использовались для теста в предыдущем дне. Надо ли оставлять в текущем задании??
    Задача была скопировать
    */
    private String color;
    private String model;
    private int year;

    /*
    getYearOfProduction использовались для теста в предыдущем дне. Надо ли оставлять в текущем задании??
    */
    public int getYearOfProduction() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(this.year - inputYear);
    }
}
