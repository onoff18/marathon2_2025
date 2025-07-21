package day12.task5;

public class MusicArtist {

    private final String name;
    private final int age;

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s, %d лет", name, age);
    }
}
