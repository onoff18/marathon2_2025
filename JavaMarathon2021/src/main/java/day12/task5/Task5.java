package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> members1 = new ArrayList<>(Arrays.asList(
                new MusicArtist("Ivan", 25),
                new MusicArtist("Sasha", 30),
                new MusicArtist("Petr", 35)));


        List<MusicArtist> members2 = new ArrayList<>(Arrays.asList(
                new MusicArtist("Dasha", 33),
                new MusicArtist("Masha", 18),
                new MusicArtist("Glasha", 25)));

        MusicBand musicBand = new MusicBand("Boys", 2022, members1);
        MusicBand musicBand1 = new MusicBand("Girls", 2022, members2);



        musicBand.printMembers();
        musicBand1.printMembers();
        System.out.println("***************************************");

        MusicBand.transferMembers(musicBand1, musicBand);

        musicBand.printMembers();
        musicBand1.printMembers();

    }
}
