package day15;

public class Shoes {

    private final String modelName;
    private final int size;
    private int balanceOnStorage;

    public Shoes(String modelName, int size, int balanceOnStorage) {
        this.modelName = modelName;
        this.size = size;
        this.balanceOnStorage = balanceOnStorage;
    }


    @Override
    public String toString() {
        return String.format("%s;%d;%d", modelName, size, balanceOnStorage);
    }
}
