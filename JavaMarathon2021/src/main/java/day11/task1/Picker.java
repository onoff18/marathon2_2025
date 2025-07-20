package day11.task1;

public class Picker extends Human implements Worker {

    private static final int BONUS_AMOUNT = 70000;

    public Picker(Warehouse warehouse) {
        super(warehouse);
        salaryPerOne = 80;
    }

    @Override
    public void doWork() {
        salary += salaryPerOne;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {

        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountPickedOrders() >= 10000) {
            salary += BONUS_AMOUNT;
            setPayed(true);
        }
    }
}
