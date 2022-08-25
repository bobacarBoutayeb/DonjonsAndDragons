package Game;

public class Game {
//    Menu menu = new Menu();
    private int boardLength = 64;
    private int[] board = new int[boardLength];
    private int diceMax = 6;
    private boolean endGame = false;
    private Menu menu;
    public Game(Menu menu){
        //Construct
        Menu start = new Menu();
    }

    /* Start Game */
    public void startGame(Menu menu){
        this.menu.showFirstMenu();
    }
    public void startSettingGame(Player player){
        System.out.println("Let the game begin!");
        this.board[0] = player.getPosition();
        System.out.println(player.getName() + " start at position " + player.getPosition());
    }

    /* Play Game */
    public void playGame(Player player, Menu menu){
        endGame = false;
        do {
            this.menu.alreadyStartedGameMenu(player);;
            if (player.getPosition() >= this.boardLength) {
                System.out.println("Good job, you won your place in paradise");
                endGame = true;
            }
        } while (!endGame);
    }
    /* Move player */
    public void rollingDiceForMoving(Player player){
        double diceRolled = ((Math.random() * (1000000)) % 6) +1;
        System.out.println("Dice roll :" + diceRolled);
    }

    /* End of game */
    public void endGame(){

    }

    public int getDiceMax() {
        return diceMax;
    }
    public void setDiceMax(int diceMax) {
        this.diceMax = diceMax;
    }
}
