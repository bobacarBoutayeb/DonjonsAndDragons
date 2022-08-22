package Game;

import java.util.Random;

public class Player {
    private String name;
    private int health;
    private int attack;
    private int minHealthWarrior = 5;
    private int maxHealthWarrior = 10;
    private int minHealthWizard = 8;
    private int maxHealthWizard = 15;
    private String[] typePlayer = {"guerrier", "magicien"};

    public Player(){

        /*
        if (this.name == "guerrier")
        {
            Random rn = new Random();
            this.health = rn.nextInt(this.maxHealthWarrior - this.minHealthWarrior + 1) + this.minHealthWarrior;
        }

        if (this.name == "magicien")
        {
            Random rn = new Random();
            this.health = rn.nextInt(this.maxHealthWizard - this.minHealthWizard + 1) + this.minHealthWizard;
        }
        */
    }
}
