package day11.task2;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.MagicAttack;

public class Shaman extends Hero implements MagicAttack, Healer {

    private static final int healHimself = 50;
    private static final int healTeammate = 30;

    public Shaman() {

        physDef = 20;
        magicDef = 20;
        physAtt = 10;
        magicAtt = 15;
        super.name = "Шаман";
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

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - damageCalculation(magicAtt, hero.magicDef));
        checkMinHealth(hero);
    }
}
