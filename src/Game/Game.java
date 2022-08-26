package Game;

public class Game {
//    Menu menu = new Menu();
    private int boardLength = 64;
    private String[] board = new String[boardLength];
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
    public void welcomeGame(){
        switch (this.menu.welcomeMenu()) {
            case "1" -> newGame();
            case "2" -> quitGame();
        }
    }
    public void newGame() {
        this.player.createPlayer(player); // return player
        switch (this.menu.initializedGameMenu()) {
            case "1" -> startGame();
            case "2" -> this.menu.playerStatsMenu();
            case "3" -> this.menu.playerStatsMenuModify();
            case "4" -> welcomeGame();
            case "5" -> quitGame();
        }
    }
    public void startGame() {
        this.menu.startGame();
        board(this.player);
        playGame();
    }
    public void board(Player player) {
        this.board[player.getPosition()] = player.getName();
        System.out.println(this.board[player.getPosition()] + " is positioned at: " + player.getPosition());
    }
    /* Play Game */
    public void playGame(){
        endGame = false;
        do {
//            this.menu.alreadyStartedGameMenu();
            moveAfterRoll();
            if (player.getPosition() >= this.boardLength) {
                System.out.println("Good job, you won your place in paradise");
                endGame = true;
            }
        } while (!endGame);
    }
    /* Move player */
    public void moveAfterRoll() {
//        int newPosition = this.player.getPosition() + rollingDiceForMoving();
        int position = this.player.getPosition();
        position = position + rollingDiceForMoving();
        this.player.setPosition(position);
    }
    public int rollingDiceForMoving(){
        double diceRolled = ((Math.random() * (1000000)) % this.diceMax) +1;
        int integerDiceRolled = (int) diceRolled;
        this.menu.showRolledDice(integerDiceRolled);
        return integerDiceRolled;
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
