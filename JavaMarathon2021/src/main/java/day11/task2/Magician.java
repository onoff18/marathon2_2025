package day11.task2;

import day11.task2.Interfaces.MagicAttack;

public class Magician extends Hero implements MagicAttack {

    public Magician() {

        physDef = 0;
        magicDef = 80;
        physAtt = 5;
        magicAtt = 20;
        super.name = "Маг";
    }

    @Override
    public void magicalAttack(Hero hero) {

        hero.setHealth(hero.getHealth() - damageCalculation(magicAtt, hero.magicDef));
        checkMinHealth(hero);

    }
}
