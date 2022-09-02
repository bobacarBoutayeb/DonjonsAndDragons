package Game;

public class Game {
//    Menu menu = new Menu();
    private final int boardLength = 64;
    private Character[] board = new Character[boardLength];
    private int diceMax = 6;
    private int turn;
    private boolean endGame = false;
    private final Menu menu = new Menu();
    private Character character;
    private GameStates states = GameStates.INITIALISATION;

    /* Construct */
    public Game(){
    }
    /* Methods */
    public void engine(){
        boolean end = false;
        while (!end){
            switch (this.states){
                case INITIALISATION -> welcomeGame();
//                case CREATION -> ;
                case PLAYING -> startedGame();
                case KILLED -> end = wasted();
                case ENDING -> end = finishedGame();
            }
        }
    }
    private boolean finishedGame() {
        System.out.println("Finished Game");
        return true;
    }
    private boolean wasted() {
        System.out.println("Wasted !");
        return true;
    }
    public boolean welcomeGame(){
        return switch (this.menu.welcomeMenu()) {
            case "1" -> gameSetup();
            case "2" -> quitGame();
            default -> true;
        };
    }
    public boolean gameSetup(){
        customiseDefaultPlayer();
        beforeStartedGame();
        return false; // we don't wanna start another start game menu
    }
    public void beforeStartedGame() {
        boolean reboucle =
                switch(this.menu.menuBeforeStarting()) {
                    case "1" -> startGame();
                    case "2" -> this.menu.playerStatsMenu(this.character);
                    case "3" -> this.menu.playerStatsMenuModify(this.character);
                    case "4" -> welcomeGame();
                    case "5" -> quitGame();
                    default -> false;
                };

        if (reboucle){
            beforeStartedGame();
        }
    }
    public void startedGame() {
        this.menu.showTurn(this.turn);
        boolean reboucle =
            switch(this.menu.menuAfterStart()) {
                case "1" -> newTurn();
                case "2" -> this.menu.playerStatsMenu(this.character);
                case "3" -> this.menu.playerStatsMenuModify(this.character);
                case "4" -> welcomeGame();
                case "5" -> quitGame();
                default -> false;
            };

        if (reboucle){
            startedGame();
        }
    }
    public void customiseDefaultPlayer() {
        String choice = this.menu.generatePlayer();
        this.menu.displayClass(choice);
        this.character = switch (choice){
                case "1" -> new Warrior();
                case "2" -> new Wizard();
                default -> null;
            };
        /* Check la branche false d'un if:

        Objects.requireNonNull(this.character); Public
        assert this.character != null : "Choix invalide"; Privée pour vérifier dès le début avant publication de l'info
         */
        this.character.setName(this.menu.getPlayerName());
        System.out.println(this.character);
    }
    public boolean startGame() {
        this.menu.startGame();
        this.turn = 1;
        // Todo Setting up the game
        // boardSettingPlayerPosition(this.player);
        this.states = GameStates.PLAYING;

        return false;
    }
    public void boardSettingPlayerPosition(Character character) {
        this.board[ character.getPosition()] = character;
        this.menu.showPlayerPosition(character);
    }
    public void playGame(){
        endGame = false;
        this.character.setPosition(0);
        do {
            moveAfterRoll();
            if (this.character.getPosition() >= this.boardLength) {
                this.menu.victory();
                endGame = true;
            }
        } while (!endGame);
    }
    /* Player's movement */
    public boolean newTurn(){
        moveAfterRoll();
        this.turn++;
        return true;
    }

    public void moveAfterRoll() {
        this.menu.showTurn(this.turn);
        this.menu.showPlayerPosition(this.character);
        int newPosition = this.character.getPosition() + rollingDiceForMoving();
        this.character.setPosition(newPosition);
        this.menu.showPlayerPosition(this.character);
    }
    public int rollingDiceForMoving(){
        double diceRolled = ((Math.random() * (1000000)) % this.diceMax) +1;
        int integerDiceRolled = (int) diceRolled;
        this.menu.showRolledDice(integerDiceRolled);
        return integerDiceRolled;
    }
    public boolean quitGame()
    {
        this.menu.leavingGame();
        this.states = GameStates.ENDING;
        return false; // We always quit
    }
    public int getDiceMax() {
        return diceMax;
    }
    public void setDiceMax(int diceMax) {
        this.diceMax = diceMax;
    }
}
