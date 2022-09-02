package Game;

public class Warrior extends Character{

    private static final int maxHealth = 15;

    public Warrior() {
        super(
                null,
                5,
                5,
                5,
                getRandomMaxHealth(maxHealth)
                );
    }
}
