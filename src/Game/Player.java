package Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Player {
    private String name;
    private int health;
    private int attack;
    private int minHealthWarrior = 5;
    private int minHealthWizard = 8;
    private int maxHealthWizard = 15;
    private int maxHealthWarrior = 15;
    public static String[] typePlayer =  {"warrior", "wizard"};
    /* Approche ArrayList
    public static ArrayList<String> typePlayer = new ArrayList<>();
    */
    public Player(){
        /* ArrayList
        typePlayer.add("guerrier");
        typePlayer.add("magicien");
        */
    }

    public Player(String nameChoosed)
    {
        this.name = nameChoosed;
    }
    public Player(String nameAssigned, int healthAssigned, int attackAssigned)
    {
        this.name = nameAssigned;
        this.health = healthAssigned;
        this.attack = attackAssigned;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getMinHealthWarrior() {
        return minHealthWarrior;
    }

    public void setMinHealthWarrior(int minHealthWarrior) {
        this.minHealthWarrior = minHealthWarrior;
    }

    public int getMinHealthWizard() {
        return minHealthWizard;
    }

    public void setMinHealthWizard(int minHealthWizard) {
        this.minHealthWizard = minHealthWizard;
    }

    public int getMaxHealthWizard() {
        return maxHealthWizard;
    }

    public void setMaxHealthWizard(int maxHealthWizard) {
        this.maxHealthWizard = maxHealthWizard;
    }

    public int getMaxHealthWarrior() {
        return maxHealthWarrior;
    }

    public void setMaxHealthWarrior(int maxHealthWarrior) {
        this.maxHealthWarrior = maxHealthWarrior;
    }
}
