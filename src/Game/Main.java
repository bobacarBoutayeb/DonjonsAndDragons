package Game;

public class Main {
    public static void main(String[] args) {
        Menu start = new Menu();
        Player player = start.generatePlayer();
        System.out.println(player);
    }
}
