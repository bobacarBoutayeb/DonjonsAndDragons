package Game;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public String getValidChoice (String[] options) {

        String choice = this.sc.nextLine();
        while (!Arrays.asList(options).contains(choice)){
            System.out.println("That's not a valid choice");
            System.out.println("Please choose a correct one:");
            choice = this.sc.nextLine().toLowerCase();
        }
        return choice;
    }
    // Interface

    // Main menu
    public void showMainMenu() {
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

    // Initialized Game Menu
    public void initializedGameMenu(Player player)
    {
        System.out.println("Choose your action: ");
        System.out.println("1 - Show player's stats");
        System.out.println("2 - Modify player's stats");
        System.out.println("3 - Go back to main menu");
        System.out.println("4 - Quit game");

        String choice = getValidChoice(new String[]{"1", "2", "3", "4"});

        switch (choice) {
            case "1" -> playerStats(player);
            case "2" -> playerModify();
            case "3" -> showMainMenu();
            case "4" -> quitGame();
        }
    }
    // Nouveau perso
    public Player generatePlayer()
    {
        System.out.println("Please choose a class between Warrior or Wizard: ");
        String choice = getValidChoice(new String[]{"warrior", "wizard"});
        System.out.println("Choosed class: " + choice);
        Player player = new Player();
        player.setType(choice);
        Random rn = new Random();
        player.setHealth(rn.nextInt(player.getMaxHealthWarrior() - player.getMinHealthWarrior() + 1) + player.getMinHealthWarrior());
        setPlayerName(player);
        return player;
    }
    // Quit game
    public void quitGame()
    {
        System.out.println("Good bye ! Good idea leaving, it sinks too much here :D.");
    }

    // Afficher info perso
    public void playerStats(Player player)
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
                playerStats(player);
            }
            case "2" -> {
                showHealth(player);
                playerStats(player);
            }
            case "3" -> {
                showAttack(player);
                playerStats(player);
            }
            case "4" -> showMainMenu();
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
    // Les modifier
    private void playerModify() {
    }
    public void setPlayerName(Player player)
    {
        System.out.println("Please choose a name: ");
        String userInput = this.sc.nextLine();
        player.setName(userInput);
        initializedGameMenu(player);
    }

    // Quitter le jeu

}
