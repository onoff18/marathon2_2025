package day11.task1;

public abstract class Human {

    protected int salaryPerOne;
    protected boolean isPayed;
    protected Warehouse warehouse;
    protected int salary;


    public Human(Warehouse warehouse) {
        this.isPayed = false;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public int getSalaryPerOne() {
        return salaryPerOne;
    }

    private String checkPayment() {
        String textIsPayed;
        if (isPayed) {
            textIsPayed = "Бонус был выплачен";
        } else {
            textIsPayed = "Бонус не выплачен";
        }
        return textIsPayed;
    }

    @Override
    public String toString() {
        return String.format("Заработная плата - %d\n%s\nВсего заработано - %d",
                salaryPerOne, checkPayment(), salary);
    }
}
