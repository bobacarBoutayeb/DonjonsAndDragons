package Game;
import java.util.InputMismatchException;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Menu {

    // Interface

    // Main menu
    public void mainMenu()
    {
        System.out.println("Welcome to my Dungeons & Dragons game that sink !");
        System.out.println("Please choose an action :");
        System.out.println("1 - New Game");
        System.out.println("2 - Quit game");
//        System.out.println("2 - Show player's stats");
//        System.out.println("3 - Change player's stats");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
/*

        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Please choose a name: ");
            String userInput = sc.nextLine();
            player.setName(userInput);
            initializedGameMenu(player);
        } catch (InputMismatchException e){
            System.out.println("NOK");
            setPlayerName(player);
        }*/

        switch (input) {
            case 1 -> generatePlayer();
            case 2 -> quitGame();
            default -> mainMenu();
        }
    }

    // Initialized Game Menu

    public void initializedGameMenu(Player player)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your action: ");
        System.out.println("1 - Show player's stats");
        System.out.println("2 - Modify player's stats");
        System.out.println("3 - Go back to main menu");
        System.out.println("4 - Quit game");
        int input = sc.nextInt();

        switch (input) {
            case 1 -> playerStats(player);
            case 2 -> playerModify();
            case 3 -> mainMenu();
            case 4 -> quitGame();
            default -> initializedGameMenu(player);
        }
    }

    // Nouveau perso
    public Player generatePlayer(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a class between Warrior or Wizard: ");
        String choice = sc.nextLine().toLowerCase();
        System.out.println(choice);

        while (!Arrays.asList(Player.typePlayer).contains(choice))
        {
            System.out.println("This class doesn't exist. New answer : ");
            choice = sc.nextLine();
        }

        System.out.println("Classe choisie: " + choice);

        if (choice.equals("warrior")){

            Player warrior = new Player();
            warrior.setType(choice);
            Random rn = new Random();
            warrior.setHealth(rn.nextInt(warrior.getMaxHealthWarrior() - warrior.getMinHealthWarrior() + 1) + warrior.getMinHealthWarrior());
            setPlayerName(warrior);

            return warrior;
        } else {

            Player wizard = new Player();
            wizard.setType(choice);
            Random rn = new Random();
            wizard.setHealth(rn.nextInt(wizard.getMaxHealthWarrior() - wizard.getMinHealthWarrior() + 1) + wizard.getMinHealthWarrior());
            setPlayerName(wizard);

            return wizard;
        }


    }

    // Quit game

    public void quitGame()
    {
        System.out.println("Good bye ! Good idea leaving, it sinks too much here :D.");
    }

    // Afficher info perso

    public void playerStats(Player player)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Show player information: ");
        System.out.println("1 - Name");
        System.out.println("2 - Health");
        System.out.println("3 - Attack");
        System.out.println("4 - Go back to main menu");
        int input = sc.nextInt();

        switch (input) {
            case 1 -> {
                showName(player);
                playerStats(player);
            }
            case 2 -> {
                showHealth(player);
                playerStats(player);
            }
            case 3 -> {
                showAttack(player);
                playerStats(player);
            }
            case 4 -> mainMenu();
            default -> playerStats(player);
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a name: ");
        String userInput = sc.nextLine();
        player.setName(userInput);
        initializedGameMenu(player);
    }

    // Quitter le jeu

}
