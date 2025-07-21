package day12.task5;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public  void printMembers(){
        System.out.println(members);
    }

    private void setMembers(List<MusicArtist> members) {
        this.members.addAll(members);
    }

    @Override
    public String toString() {
        return String.format("Это группа - %s, год основания - %d\n",
                name, year);
    }

    public static void transferMembers (MusicBand musicBandOut, MusicBand musicBandIn) {
        musicBandIn.setMembers(musicBandOut.getMembers());
        musicBandOut.members.clear();
    }
}
