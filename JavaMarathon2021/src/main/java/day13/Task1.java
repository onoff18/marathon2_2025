package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Ivan");
        User user2 = new User("Petr");
        User user3 = new User("Dasha");

        user1.sendMessage(user2, "ПРивет");
        user1.sendMessage(user2, "Че как?");

        user2.sendMessage(user1, "Прив");
        user2.sendMessage(user1, "Норм");
        user2.sendMessage(user1, "ниче так");

        user3.sendMessage(user1, "Добрый день");
        user3.sendMessage(user1, "Квартиры в Москве");
        user3.sendMessage(user1, "По низкой цене");

        user1.sendMessage(user3, "Как же вы надоели");
        user1.sendMessage(user3, "С самого утра какую то ересь несете");
        user1.sendMessage(user3, "Где вы видели дешевые квартиры в Москве");

        user3.sendMessage(user1, "Ща покажу");

        user1.subscribe(user2);
        user1.subscribe(user3);

        System.out.println(user1.isFriend(user2));
        System.out.println(user2.isSubscribed(user1));
        System.out.println(user1.isSubscribed(user2));

        MessageDatabase.showDialog(user1, user3);

        System.out.println(MessageDatabase.getMessages());

    }
}
