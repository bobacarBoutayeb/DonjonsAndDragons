package Game;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public String getValidChoice (String[] options) {
        System.out.println("Enter choice:");
        String choice = this.sc.nextLine();
        while (!Arrays.asList(options).contains(choice)){
            System.out.println("That's not a valid choice");
            System.out.println("Please choose a correct one:");
            choice = this.sc.nextLine().toLowerCase();
        }
        return choice;
    }
    // Interface

    /* Main menu */
    public void showFirstMenu() {
        System.out.println("Welcome to my Dungeons & Dragons game that sink !");
        System.out.println("Please choose an action :");
        System.out.println("1 - New Game");
        System.out.println("2 - Quit game");

        String choice = getValidChoice(new String[]{"1", "2"});

        switch (choice) {
            case "1" -> generatePlayer();
            case "2" -> quitGame();
        }
    }

    /* Nouveau perso */
    public void generatePlayer()
    {
        System.out.println("Please choose a class: \n1 - Warrior\n2 - Wizard");
        String choice = getValidChoice(new String[]{"1", "2"});
        System.out.println("Choosed class: " + choice);
        Player player = new Player();
        player.setType(choice);
        Random rn = new Random();
        player.setHealth(rn.nextInt(player.getMaxHealthWarrior() - player.getMinHealthWarrior() + 1) + player.getMinHealthWarrior());
        setPlayerName(player);
    }

    /* Initialized Game Menu */
    public void initializedGameMenu(Player player)
    {
        System.out.println("Choose your action: ");
        System.out.println("1 - Show player's stats");
        System.out.println("2 - Modify player's stats");
        System.out.println("3 - Restart a new game");
        System.out.println("4 - Quit game");

        String choice = getValidChoice(new String[]{"1", "2", "3", "4"});

        switch (choice) {
            case "1" -> playerStatsMenu(player);
            case "2" -> playerStatsMenuModify(player);
            case "3" -> showFirstMenu();
            case "4" -> quitGame();
        }
    }

    /* Afficher info perso  */
    public void playerStatsMenu(Player player)
    {
        System.out.println("Show player information: ");
        System.out.println("1 - Name");
        System.out.println("2 - Health");
        System.out.println("3 - Attack");
        System.out.println("4 - Go back to main menu");

        String choice = getValidChoice(new String[] {"1", "2", "3", "4"});

        switch (choice) {
            case "1" -> {
                showName(player);
                playerStatsMenu(player);
            }
            case "2" -> {
                showHealth(player);
                playerStatsMenu(player);
            }
            case "3" -> {
                showAttack(player);
                playerStatsMenu(player);
            }
            case "4" -> initializedGameMenu(player);
        }
    }

    public void showName(Player player)
    {
        System.out.println("Player's name: " + player.getName());
    }
    public void showHealth(Player player)
    {
        System.out.println(player.getName() + " have " + player.getHealth() + " HP.");
    }
    public void showAttack(Player player)
    {
        System.out.println(player.getName() + " have " + player.getAttack() + " ATK.");
    }

    /* Les modifier */

    /* Afficher info perso  */
    public void playerStatsMenuModify(Player player)
    {
        System.out.println("Modify player information: ");
        System.out.println("1 - Name");
        System.out.println("2 - Health");
        System.out.println("3 - Attack");
        System.out.println("4 - Go back to main menu");

        String choice = getValidChoice(new String[] {"1", "2", "3", "4"});

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
        }
    }
    public void setHealthPrompted(Player player)
    {
        int choice2;
        do {
            System.out.println("How much HP you want to set for this player ?");
            while (!this.sc.hasNextInt()) {
                System.out.println("That's not number");
                this.sc.next();
            }
            choice2 = this.sc.nextInt();

            if (choice2 <= 0) {
                System.out.println("HP must be a positive value");
            }
        } while (choice2 <= 0);
        player.setHealth(choice2);
        this.sc.nextLine(); // clear buffer
    }
    public void setAttackPrompted(Player player)
    {
        int choice;
        do {
            System.out.println("How much ATK you want to set for this player ?");
            while (!this.sc.hasNextInt()) { //Check int
                System.out.println("That's not number");
                this.sc.next();
            }
            choice = this.sc.nextInt(); // Save the previous int in the input

            if (choice <= 0) {
                System.out.println("ATK must be a positive value");
            }
        } while (choice <= 0);
        player.setAttack(choice);
        this.sc.nextLine(); // clear buffer
    }

    public void setPlayerName(Player player)
    {
        System.out.println("Please choose a name: ");
        String userInput = this.sc.nextLine();
        player.setName(userInput);
        initializedGameMenu(player);
    }



    /* Quitter le jeu */
    public void quitGame()
    {
        System.out.println("Good bye ! Good idea leaving, it sinks too much here :D.");
    }
}
