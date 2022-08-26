package Game;

public class Game {
//    Menu menu = new Menu();
    private int boardLength = 64;
    private int[] board = new int[boardLength];
    private int diceMax = 6;
    private boolean endGame = false;
    private Menu menu;
    private Player player;

    /* Construct */
    public Game(){
        this.menu = new Menu();
        this.player = new Player();
    }

    /* Methods */
    public void startGame(){
        switch (this.menu.showFirstMenu()) {
            case "1" -> this.player.generatePlayer();
//                this.menu.initializedGameMenu(); }
            case "2" -> quitGame();
        }
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
            this.menu.alreadyStartedGameMenu();
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
    public void endGame(){

    }
    public void quitGame()
    {
        System.out.println("Good bye ! Good idea leaving, it sinks too much here :D.");
    }
    public int getDiceMax() {
        return diceMax;
    }
    public void setDiceMax(int diceMax) {
        this.diceMax = diceMax;
    }
}
