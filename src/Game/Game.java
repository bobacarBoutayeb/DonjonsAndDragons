package Game;

import java.util.Random;

public class Game {
//    Menu menu = new Menu();
    private final int boardLength = 64;
    private Player[] board = new Player[boardLength];
    private int diceMax = 6;
    private boolean endGame = false;
    private Menu menu;
    private Player player;
    private GameStates states = GameStates.INITIALISATION;

    /* Construct */
    public Game(){
        this.menu = new Menu();
        this.player = new Player();
    }
    /* Methods */
    public void engine(){
        boolean end = false;
        while (!end){
            switch (this.states){
                case INITIALISATION -> {
                    customiseDefaultPlayer();
                    while (this.states == GameStates.INITIALISATION)
                    {
                        beforeStartedGame();
                    }
                }
//                case CREATION -> ;
                case PLAYING -> end = playing();
                case KILLED -> leNeant();
                case ENDING -> end = leNeant();
            }
        }
    }

    private boolean leNeant() {
        System.out.println("neant");
        return true;
    }
    private boolean playing() {
        System.out.println("play");
        return true;
    }

    public void welcomeGame(){
        switch (this.menu.welcomeMenu()) {
            case "1" -> gameSetup();
            case "2" -> quitGame();
        }
    }
    public void gameSetup(){
        customiseDefaultPlayer();
        beforeStartedGame();
    }
    public void beforeStartedGame() {
        switch(this.menu.menuBeforeStarting()) {
            case "1" -> startGame();
            case "2" -> playerShowStats(this.player);
            case "3" -> playerModifyStats(this.player);
            case "4" -> gameSetup();
            case "5" -> quitGame();
        }
    }

    private void playerModifyStats(Player player) {
        switch (this.menu.playerStatsMenuModify(player)){
            case "1" -> player.setPlayerName();
            case "2" -> player.setHealth(this.menu.setHealthPrompted());
            case "3" -> player.setAttack(this.menu.setAttackPrompted());
            case "4" -> playerModifyStats(player);
        }
    }

    private void playerShowStats(Player player) {
        switch (this.menu.playerStatsMenu()){
            case "1" -> this.menu.showName(player);
            case "2" -> this.menu.showHealth(player);
            case "3" -> this.menu.showAttack(player);
            case "4" -> playerShowStats(player) ;
        }
    }

    public void startedGame() {
        switch(this.menu.menuAfterStart()) {
            case "1" -> newTurn();
            case "2" -> playerShowStats(this.player);
            case "3" -> this.menu.playerStatsMenuModify(this.player);
            case "4" -> gameSetup();
            case "5" -> quitGame();
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
        // Todo Setting up the game
        // boardSettingPlayerPosition(this.player);
        this.states = GameStates.PLAYING;
    }
    public void boardSettingPlayerPosition(Player player) {
        this.board[player.getPosition()] = player;
        this.menu.showPlayerPosition(player);
    }
    public void playGame(){
        endGame = false;
        this.player.setPosition(0);
        do {
            moveAfterRoll();
            if (this.player.getPosition() >= this.boardLength) {
                this.menu.victory();
                endGame = true;
            }
        } while (!endGame);
    }
    /* Player's movement */
    public boolean newTurn(){
        moveAfterRoll();
        return true;
    }

    public void moveAfterRoll() {
        this.menu.showPlayerPosition(this.player);
        int newPosition = this.player.getPosition() + rollingDiceForMoving();
        this.player.setPosition(newPosition);
        this.menu.showPlayerPosition(this.player);
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
        this.states = GameStates.ENDING;
    }
    public int getDiceMax() {
        return diceMax;
    }
    public void setDiceMax(int diceMax) {
        this.diceMax = diceMax;
    }
}
