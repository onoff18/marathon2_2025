package day11.task1;

public class Warehouse {

    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    protected void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    protected void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    @Override
    public String toString() {
        return String.format("Количество собранных заказов - %d\n" +
                "Количество доставленных заказов - %d", countPickedOrders, countDeliveredOrders);
    }
}
