package day7;

import day4.Task1;

public class Task2 {
    public static void main(String[] args) {

        Player.info();

        Player player1 = new Player(Task1.randomNum(90, 100));
        Player player2 = new Player(Task1.randomNum(90, 100));
        Player player3 = new Player(Task1.randomNum(90, 100));
        Player player4 = new Player(Task1.randomNum(90, 100));

        System.out.println("Создали игроков - 4");
        Player.info();

        Player player5 = new Player(Task1.randomNum(90, 100));
        Player player6 = new Player(Task1.randomNum(90, 100));

        System.out.println("Создали игроков - 6");
        Player.info();

        Player player7 = new Player(Task1.randomNum(90, 100));
        Player player8 = new Player(Task1.randomNum(90, 100));

        System.out.println("Создали игроков - 8");
        Player.info();

        System.out.println("Пробежал 0 раз");
        System.out.println(player1.getStamina());

        player1.run();
        player1.run();

        System.out.println("Пробежал 2 раз");
        System.out.println(player1.getStamina());

        for (int i = 0; i < 100; i++) {
            player1.run();
        }

        System.out.println("Пробежал 102 раз");
        System.out.println(player1.getStamina());
        Player.info();


    }
}
