package Game;

public class Warrior extends Character{

    private static final int minHealthWarrior = 5;
    private static final int maxHealthWarrior = 10;
    private static final int minAtkWarrior = 5;
    private static final int maxAtkWarrior = 10;

    public Warrior() {
        super(
                randomStat(minAtkWarrior,maxAtkWarrior),
                randomStat(minHealthWarrior, maxHealthWarrior)
                );
    }
    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", atkStuff=" + atkStuff +
                ", attack=" + attack +
                ", defStuff=" + defStuff +
                ", health=" + health +
                '}';
    }
}
