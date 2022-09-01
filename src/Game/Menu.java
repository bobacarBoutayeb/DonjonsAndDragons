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
                Welcome back to my Dungeons & Dragons game that sink !
                
                ****************************
                * Please choose an action: *
                ****************************
                1 - New Game
                2 - Quit game
                """);

        return getValidChoice(new String[]{"1", "2"});
    }
    public String menuBeforeStarting()
    {
        System.out.println("""
                "***********************"
                "* Choose your action: *"
                "***********************"
                1 - Start the game
                2 - Show player's stats, to see your ugly zero
                3 - Modify player's stats, cheat code is good
                4 - Restart a new game
                5 - Quit game
                """);

        return getValidChoice(new String[]{"1", "2", "3", "4", "5"});
    }
    public String menuAfterStart()
    {
        System.out.println("""
                "***********************"
                "* Choose your action: *"
                "***********************"
                1 - Roll the dices
                2 - Show player's stats, to see your ugly zero
                3 - Modify player's stats, cheat code is good
                4 - Restart a new game
                5 - Quit game
                """);

        return getValidChoice(new String[]{"1", "2", "3", "4", "5"});
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
    public boolean playerStatsMenu(Player player) {
        System.out.println("""
                ****************************
                * Show player information: *
                ****************************
                1 - Name
                2 - Health
                3 - Attack
                4 - Go back to main menu
                """);

        String choice = getValidChoice(new String[] {"1", "2", "3", "4"});
        boolean result = false;
        switch (choice){
            case "1" -> showName(player);
            case "2" -> showHealth(player);
            case "3" -> showAttack(player);
            case "4" -> result = true ;
        }
        return result || playerStatsMenu(player); // If result false check the second thing.
    }
    public void showName(Player player){
        System.out.println("******************************************");
        System.out.println("* Player's name: " + player.getName() + " *");
        System.out.println("******************************************");
        System.out.println();
    }
    public void showHealth(Player player){
        System.out.println("******************************************");
        System.out.println("* " + player.getName() + " have " + player.getHealth() + " HP. *");
        System.out.println("******************************************");
        System.out.println();
    }
    public void showAttack(Player player){
        System.out.println("******************************************");
        System.out.println("* " + player.getName() + " have " + player.getAttack() + " ATK. *");
        System.out.println("******************************************");
        System.out.println();
    }

    /* Les modifier */
    public boolean playerStatsMenuModify(Player player)
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

        String choice = getValidChoice(new String[] {"1", "2", "3", "4"});
        boolean result = false;
        switch (choice){
            case "1" -> player.setPlayerName();
            case "2" -> player.setHealth(setHealthPrompted());
            case "3" -> player.setAttack(setAttackPrompted());
            case "4" -> result = true ;
        }
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
        return result || playerStatsMenuModify(player);
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
            while (!this.sc.hasNextInt()) { // Check int
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
        System.out.println("------------------------");
        System.out.println(player.getName() + " is positioned at: " + player.getPosition());
        System.out.println("------------------------");
    }
    public void victory(){
        System.out.println("""
                *********************************************
                * Good job, you won your place in paradise! *
                *********************************************
                """);
    }
}
