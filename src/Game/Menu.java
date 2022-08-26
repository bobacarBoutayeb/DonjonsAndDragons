package Game;

public class Menu implements Validation{

    // Interface

    /* Main menu */
    public String showFirstMenu() {
        System.out.println("""
                Welcome to my Dungeons & Dragons game that sink !
                
                ****************************
                * Please choose an action: *
                ****************************
                1 - New Game
                2 - Quit game
                """);

        return getValidChoice(new String[]{"1", "2"});
/*
        switch (choice) {
            case "1" -> generatePlayer();
            case "2" -> quitGame();
        }*/
    }

    /* Initialized Game Menu */
    public String initializedGameMenu()
    {
        System.out.println("""
                "***********************"
                "* Choose your action: *"
                "***********************"
                1 - Start the game
                2 - Show player's stats
                3 - Modify player's stats
                4 - Restart a new game
                5 - Quit game
                """);

        return getValidChoice(new String[]{"1", "2", "3", "4", "5"});
/*
        switch (choice) {
            case "1" -> this.game.startSettingGame(player);
            case "2" -> playerStatsMenu(player);
            case "3" -> playerStatsMenuModify(player);
            case "4" -> showFirstMenu();
            case "5" -> quitGame();
        }
        */
    }

    /* Already started Game Menu */
    public String alreadyStartedGameMenu()
    {
        System.out.println("""
                "***********************"
                "* Choose your action: *"
                "***********************"
                1 - Roll the dice to continue the game
                2 - Show player's stats
                3 - Modify player's stats
                4 - Restart a new game
                5 - Quit game
                """);

        return getValidChoice(new String[]{"1", "2", "3", "4", "5"});

        /*
        switch (choice) {
//            case "1" -> this.game.rollingDiceForMoving(player);
            case "2" -> playerStatsMenu(player);
            case "3" -> playerStatsMenuModify(player);
            case "4" -> showFirstMenu();
            case "5" -> quitGame();
        }
         */
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
    public String getPlayerName() {
        System.out.println("*** Please choose a name: ***");

        return this.sc.nextLine();
    }
    public String playerStatsMenu()
    {
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
        /*
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
         */
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

    /* Afficher info perso  */
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
    public void setHealthPrompted(Player player)
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
        player.setHealth(choice);
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
}
