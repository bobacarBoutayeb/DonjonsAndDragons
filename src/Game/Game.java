package Game;

public class Game {
//    Menu menu = new Menu();
    private int boardLength = 64;
    private int[] board = new int[boardLength];
    private int diceMax = 6;
    public Game()
    {
        //Construct
    }

    /* Start Game */
    public void startGame(Player player){
        System.out.println("Let the game begin!");
        this.board[0] = player.getPosition();
        System.out.println(player.getName() + " start at position " + player.getPosition());
//        this.menu.alreadyStartedGameMenu(player);
    }

    /* Move player */
    public void rollingDiceForMoving(Player player){
        double diceRolled = ((Math.random() * (1000000)) % 6) +1;
        System.out.println("Dice roll :" + diceRolled);
//        this.menu.alreadyStartedGameMenu(player);
    }

    /* End of game */
    public void endGame(){
//        this.menu.showFirstMenu();
    }

    public int getDiceMax() {
        return diceMax;
    }
    public void setDiceMax(int diceMax) {
        this.diceMax = diceMax;
    }
}
