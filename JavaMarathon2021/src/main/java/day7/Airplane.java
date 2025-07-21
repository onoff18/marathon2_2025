package day7;

public class Airplane {

    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    /*
    setManufacturer использовался для теста в предыдущем дне.
    Надо ли оставлять неиспользуемые методы текущем задание??
    */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /*
    setLength, setWeight, setFuel использовались для теста в предыдущем дне.
    Надо ли оставлять неиспользуемые методы текущем задание??
    */
    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d," +
                        " вес: %d, количество топлива в баке: %d\n", this.manufacturer, this.year,
                this.length, this.weight, this.fuel);
    }

    /*
    fillUp использовался для теста в предыдущем дне.
    Надо ли оставлять неиспользуемые методы текущем задание??
    */
    public void fillUp(int n) {
        this.fuel += n;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {

        if (airplane1.length > airplane2.length) {
            System.out.println("Первый самолет длиннее");
        } else if (airplane1.length < airplane2.length) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }

    }

}
