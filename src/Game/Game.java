package Game;

public class Game {
    int boardLength = 64;
    int[] board = new int[boardLength];
    int diceMax = 6;

    // Prompt type personnage?
    public Game()
    {
        Menu start = new Menu();
        start.playerChoice();
    }

    public static void main(String[] args) {

    }
}
