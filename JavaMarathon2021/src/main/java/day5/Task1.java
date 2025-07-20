package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setColor("Синий");
        car.setModel("Жигули");
        car.setYearOfProduction(2020);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYearOfProduction());

    }
}
