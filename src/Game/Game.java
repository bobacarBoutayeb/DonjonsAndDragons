package Game;

import java.util.Random;

public class Game {
//    Menu menu = new Menu();
    private int boardLength = 64;
    private Player[] board = new Player[boardLength];
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
            case "1" -> gameSetup();
            case "2" -> quitGame();
        }
    }
    public void gameSetup(){
        customiseDefaultPlayer();
        newGame();
    }
    public void newGame() {
        switch (this.menu.mainMenu()) {
            case "1" -> startGame();
            case "2" -> newTurn();
            case "3" -> this.menu.playerStatsMenu(this.player);
            case "4" -> this.menu.playerStatsMenuModify();
            case "5" -> welcomeGame();
            case "6" -> quitGame();
        }
    }
    public void customiseDefaultPlayer() {
        String choice = this.menu.generatePlayer();
        this.menu.displayClass(choice);
        this.player.setType(choice);
        Random rn = new Random();
        this.player.setHealth(rn.nextInt(this.player.getMaxHealthWarrior() - this.player.getMinHealthWarrior() + 1) + this.player.getMinHealthWarrior());
        this.player.setPlayerName();
    }
    public void startGame() {
        this.menu.startGame();
        boardSettingPlayerPosition(this.player);
        playGame();
    }
    public void boardSettingPlayerPosition(Player player) {
        this.board[player.getPosition()] = player;
        this.menu.showPlayerPosition(player);
    }
    public void playGame(){
        endGame = false;
        do {
//            this.menu.alreadyStartedGameMenu();
            moveAfterRoll();
            this.menu.showPlayerPosition(this.player);
            if (this.player.getPosition() >= this.boardLength) {
                System.out.println("Good job, you won your place in paradise");
                endGame = true;
            }
        } while (!endGame);
    }
    /* Player's movement */
    public void newTurn(){

    }

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
