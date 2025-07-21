package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>(Arrays.asList("1", "2", "3"));
        List<String> members2 = new ArrayList<>(Arrays.asList("4", "5", "6"));

        MusicBand musicBand = new MusicBand("222",1111, members1);
        MusicBand musicBand1 = new MusicBand("444",1111, members2);

        musicBand.printMembers();
        musicBand1.printMembers();
        System.out.println("***************************************");

        MusicBand.transferMembers(musicBand1, musicBand);

        musicBand.printMembers();
        musicBand1.printMembers();

    }
}
