package Game;

import java.util.Random;

public class Player {
    String name;
    int health;
    int attack;
    int minHealthWarrior = 10;
    int maxHealthWarrior = 10;
    int minHealthWizard = 8;
    int maxHealthWizard = 15;

    public Player(){
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
    }
}
