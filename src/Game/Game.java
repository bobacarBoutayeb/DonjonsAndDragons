package Game;

public class Game {
    private int boardLength = 64;
    private int[] board = new int[boardLength];
    private int diceMax = 6;

    // Prompt type personnage?
    public Game()
    {

    }
    public int getDiceMax() {
        return diceMax;
    }
    public void setDiceMax(int diceMax) {
        this.diceMax = diceMax;
    }
}
