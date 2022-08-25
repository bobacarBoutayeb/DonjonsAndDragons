package Game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MenuInteractions {

    public MenuInteractions(Menu menu, Game game) {
        menu = new Menu();
        game = new Game();
    }

        System.out.println("1 - New Game");
        System.out.println("2 - Quit game");

        switch (choice) {
            case "1" -> generatePlayer();
            case "2" -> quitGame();
        }
    }

    /* Nouveau perso */

        System.out.println("1 - Warrior");
        System.out.println("2 - Wizard");

        System.out.println("Choosed class: " + choice);

        Player player = new Player();
        player.setType(choice);

        Random rn = new Random();
        player.setHealth(rn.nextInt(player.getMaxHealthWarrior() - player.getMinHealthWarrior() + 1) + player.getMinHealthWarrior());


        setPlayerName(player);
    }

    /* Initialized Game Menu */

        System.out.println("1 - Start the game");
        System.out.println("2 - Show player's stats");
        System.out.println("3 - Modify player's stats");
        System.out.println("4 - Restart a new game");
        System.out.println("5 - Quit game");

        switch (choice) {
//            case "1" -> this.game.startSettingGame(player);
            case "2" -> playerStatsMenu(player);
            case "3" -> playerStatsMenuModify(player);
            case "4" -> showFirstMenu();
            case "5" -> quitGame();
        }
    }

    /* Already started Game Menu */

        System.out.println("1 - Roll the dice to continue the game");
        System.out.println("2 - Show player's stats");
        System.out.println("3 - Modify player's stats");
        System.out.println("4 - Restart a new game");
        System.out.println("5 - Quit game");

        switch (choice) {
//            case "1" -> this.game.rollingDiceForMoving(player);
            case "2" -> playerStatsMenu(player);
            case "3" -> playerStatsMenuModify(player);
            case "4" -> showFirstMenu();
            case "5" -> quitGame();
        }
    }

    /* Afficher info perso  */

        System.out.println("1 - Name");
        System.out.println("2 - Health");
        System.out.println("3 - Attack");
        System.out.println("4 - Go back to main menu");

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
        System.out.println("******************************");
        System.out.println("* Modify player information: *");
        System.out.println("******************************");
        System.out.println("1 - Name");
        System.out.println("2 - Health");
        System.out.println("3 - Attack");
        System.out.println("4 - Go back to main menu");

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
            System.out.println("*** How much HP you want to set for this player? ***");
            while (!this.sc.hasNextInt()) {
                System.out.println("That's not number");
                this.sc.next();
            }
            choice2 = this.sc.nextInt();

            if (choice2 <= 0) {
                System.out.println("*** HP must be a positive value ***");
            }
        } while (choice2 <= 0);
        player.setHealth(choice2);
        this.sc.nextLine(); // clear buffer
    }
    public void setAttackPrompted(Player player)
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
        player.setAttack(choice);
        this.sc.nextLine(); // clear buffer
    }

    public void setPlayerName(Player player)
    {
        System.out.println("*** Please choose a name: ***");
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
