package day11.task2;

public class Task2 {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Magician magician = new Magician();
        Paladin paladin = new Paladin();
        Shaman shaman = new Shaman();

//        1.	Воин атакует Паладина
//        2.	Паладин атакует Мага
//        3.	Шаман лечит Мага
//        4.	Маг атакует Паладина, тип атаки М
//        5.	Шаман атакует Воина, тип атаки Ф
//        6.	Паладин лечит себя
//        7.	Воин атакует Мага 5 раз

        warrior.physicalAttack(paladin);
        System.out.println(paladin);

        paladin.physicalAttack(magician);
        System.out.println(magician);

        shaman.healTeammate(magician);
        System.out.println(magician);

        magician.magicalAttack(paladin);
        System.out.println(paladin);

        shaman.physicalAttack(warrior);
        System.out.println(warrior);

        paladin.healHimself();
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician);
        }


    }
}
