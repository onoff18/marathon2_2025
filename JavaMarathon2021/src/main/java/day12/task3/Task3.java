package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> musicBands = new ArrayList<>(Arrays.asList( new MusicBand("First", 2000),
                new MusicBand("Second", 1996),
                new MusicBand("Third", 1997),
                new MusicBand("Fourth", 1998),
                new MusicBand("Fifth", 1999),
                new MusicBand("Sixth", 2000),
                new MusicBand("Seventh", 2001),
                new MusicBand("Eighth", 2002),
                new MusicBand("Ninth", 2003),
                new MusicBand("Tenth", 2004)));

        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        System.out.println("******************");
        System.out.println(groupsAfter2000(musicBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand band : bands) {
            if(band.getYear() > 2000){
                groupsAfter2000.add(band);
            }
        }
        return groupsAfter2000;
    }
}
