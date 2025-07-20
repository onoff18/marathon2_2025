package day11.task2;

import day11.task2.Interfaces.Healer;

public class Paladin extends Hero implements Healer {

    private static final int healHimself = 25;
    private static final int healTeammate = 10;

    public Paladin() {

        physDef = 50;
        magicDef = 20;
        physAtt = 15;
        magicAtt = 0;
        super.name = "Паладин";
    }

    @Override
    public void healHimself() {
        health += healHimself;
        checkMaxHealth(this);
    }

    @Override
    public void healTeammate(Hero hero) {

        hero.setHealth(hero.getHealth() + healTeammate);
        checkMaxHealth(hero);

    }
}
