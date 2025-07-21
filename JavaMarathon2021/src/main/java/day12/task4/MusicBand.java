package day12.task4;

import java.util.List;

public class MusicBand {

    private final String name;
    private final int year;
    private final List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println(members);
    }

    private void setMembers(List<String> members) {
        this.members.addAll(members);
    }

    @Override
    public String toString() {
        return String.format("Это группа - %s, год основания - %d\n",
                name, year);
    }

    public static void transferMembers(MusicBand musicBandOut, MusicBand musicBandIn) {
        musicBandIn.setMembers(musicBandOut.getMembers());
        musicBandOut.members.clear();
    }
}
