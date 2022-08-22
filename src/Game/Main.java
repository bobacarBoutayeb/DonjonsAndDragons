package Game;

public class Main {
    public static void main(String[] args) {
        Menu start = new Menu();
        Player player = start.playerChoice();
        System.out.println(player);
    }
}
