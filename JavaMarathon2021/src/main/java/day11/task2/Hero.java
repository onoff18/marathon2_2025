package day11.task2;

import day11.task2.Interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {

    private static final int MAX_HEALTH = 100;
    private static final int MIN_HEALTH = 0;

    protected int health;
    protected int physAtt;
    protected int physDef;
    protected int magicAtt;
    protected int magicDef;
    protected String name;


    public Hero() {
        this.health = MAX_HEALTH;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    protected int getHealth() {
        return health;
    }

    public void physicalAttack(Hero hero) {

        hero.setHealth(hero.getHealth() - damageCalculation(physAtt, hero.physDef));
        checkMinHealth(hero);

    }

    public static void checkMinHealth(Hero hero) {
        if (hero.health <= MIN_HEALTH) {
            hero.setHealth(MIN_HEALTH);
        }
    }

    public static void checkMaxHealth(Hero hero) {
        if (hero.health >= MAX_HEALTH) {
            hero.setHealth(MAX_HEALTH);
        }
    }

    @Override
    public String toString() {
        return String.format("%s ** Количество здоровья - %d **", name, health);
    }

    protected static int damageCalculation(int att, int def) {
        return att - (att * def / 100);
    }
}
