package day11.task1;

public class Courier extends Human implements Worker {


    private static final int BONUS_AMOUNT = 50000;

    public Courier(Warehouse warehouse) {
        super(warehouse);
        salaryPerOne = 100;
    }

    @Override
    public void doWork() {
        salary += salaryPerOne;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {

        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountDeliveredOrders() >= 10000) {
            salary += BONUS_AMOUNT;
            setPayed(true);
        }
    }
}
