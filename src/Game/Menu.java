package Game;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    private String ChoiceInputPrompted(){
        System.out.println("*** Enter your choice: ***");
        return this.sc.nextLine().toLowerCase();
    }
    private String getValidChoice (String[] options) {
        String choice = ChoiceInputPrompted();
        while (!Arrays.asList(options).contains(choice)){
            System.out.println("""
                    
                    That's not a valid choice
                    Please choose a correct one
                    """);
            choice = ChoiceInputPrompted();
        }
        return choice;
    }

    // Interface
    public String welcomeMenu() {
        System.out.println("""
                Welcome to my Dungeons & Dragons game that sink !
                
                ****************************
                * Please choose an action: *
                ****************************
                1 - New Game
                2 - Quit game
                """);

        return getValidChoice(new String[]{"1", "2"});
    }
    public String mainMenu()
    {
        System.out.println("""
                "***********************"
                "* Choose your action: *"
                "***********************"
                1 - Start the game
                2 - Roll the dice to continue the game
                3 - Show player's stats
                4 - Modify player's stats
                5 - Restart a new game
                6 - Quit game
                """);

        return getValidChoice(new String[]{"1", "2", "3", "4", "5", "6"});
    }
    public void startGame(){
        System.out.println("Let the game begin!");
    }
    public String generatePlayer() {
        System.out.println("""
                **************************
                * Please choose a class: *
                **************************
                1 - Warrior
                2 - Wizard
                """);

        return getValidChoice(new String[]{"1", "2"});
    }
    public void displayClass(String choice){
        System.out.println("Choosed class: " + choice);
    }
    public String getPlayerName() {
        System.out.println("*** Please choose a name: ***");

        return this.sc.nextLine();
    }
    public String promptPlayerHealth() {
        System.out.println("*** How much health you want to set? ***");

        return this.sc.nextLine();
    }
    public String playerStatsMenu() {
        System.out.println("""
                ****************************
                * Show player information: *
                ****************************
                1 - Name
                2 - Health
                3 - Attack
                4 - Go back to main menu
                """);

        return getValidChoice(new String[] {"1", "2", "3", "4"});
    }
    public void showName(Player player){
        System.out.println("Player's name: " + player.getName());
    }
    public void showHealth(Player player){
        System.out.println(player.getName() + " have " + player.getHealth() + " HP.");
    }
    public void showAttack(Player player){
        System.out.println(player.getName() + " have " + player.getAttack() + " ATK.");
    }

    /* Les modifier */
    public String playerStatsMenuModify()
    {
        System.out.println("""
                ******************************
                * Modify player information: *
                ******************************
                1 - Name
                2 - Health
                3 - Attack
                4 - Go back to main menu
                """);

        return getValidChoice(new String[] {"1", "2", "3", "4"});
        /*
        switch (choice) {
            case "1" -> {
                setPlayerName(player);
                playerStatsMenuModify(player);
            }
            case "2" -> {
                setHealthPrompted(player);
                playerStatsMenuModify(player);
            }
            case "3" -> {
                setAttackPrompted(player);
                playerStatsMenuModify(player);
            }
            case "4" -> initializedGameMenu(player);
        }*/
    }
    public int setHealthPrompted()
    {
        int choice;
        do {
            System.out.println("*** How much HP you want to set for this player? ***");
            while (!this.sc.hasNextInt()) {
                System.out.println("That's not number");
                this.sc.next();
            }
            choice = this.sc.nextInt();

            if (choice <= 0) {
                System.out.println("*** HP must be a positive value ***");
            }
        } while (choice <= 0);
        this.sc.nextLine(); // clear buffer

        return choice;
    }
    public int setAttackPrompted()
    {
        int choice;
        do {
            System.out.println("*** How much ATK you want to set for this player? ***");
            while (!this.sc.hasNextInt()) { //Check int
                System.out.println("That's not number");
                this.sc.next();
            }
            choice = this.sc.nextInt(); // Save the previous int in the input

            if (choice <= 0) {
                System.out.println("ATK must be a positive value");
            }
        } while (choice <= 0);
        this.sc.nextLine(); // clear buffer

        return choice;
    }
    public void showRolledDice(int diceRolled) {
        System.out.println("Dice roll :" + diceRolled);
    }
    public void showPlayerPosition(Player player){
        System.out.println(player.getName() + " is now positioned at: " + player.getPosition());
        System.out.println("----------------------------");
    }
}
