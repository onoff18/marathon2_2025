package day7;

public class Player {

    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private static final int MAX_COUNT_PLAYERS = 6;

    public Player(int stamina) {
        checkPlayers();
        this.stamina = stamina;
        if (this.stamina > MAX_STAMINA){
            this.stamina = MAX_STAMINA;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {

        if (this.stamina > 1) {

            this.stamina--;

        } else if (this.stamina == 1) {

            this.stamina--;
            countPlayers--;

        } else {

            this.stamina = MIN_STAMINA;

        }
    }

    public static void info() {
        if (countPlayers >= 6) {
            System.out.println("На поле нет свободных мест");
        } else {
            System.out.printf("Команды неполные. На поле еще есть %d %s\n",
                    MAX_COUNT_PLAYERS - countPlayers, selectingEnding(countPlayers));
        }
    }

    private static void checkPlayers() {
        if (countPlayers >= 6) {
            countPlayers = 6;
        } else {
            countPlayers++;
        }
    }

    private static String selectingEnding (int countPlayers){
        String ending;

        switch (MAX_COUNT_PLAYERS - countPlayers){
            case 1:
                ending = "свободное место";
                break;
            case 2:
            case 3:
            case 4:
                ending = "свободных места";
                break;
            default:
                ending = "свободных мест";
        }

        return ending;
    }
}
