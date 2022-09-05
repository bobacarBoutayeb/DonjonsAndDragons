package character.hero;

import character.Perso;

public class Wizard extends Perso {

    private static final int minHealthWizard = 5;
    private static final int maxHealthWizard = 10;
    private static final int minAtkWizard = 8;
    private static final int maxAtkWizard = 15;

    public Wizard() {
        super(
                randomStat(minAtkWizard,maxAtkWizard),
                randomStat(minHealthWizard, maxHealthWizard)
                );
    }
    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", atkStuff=" + atkStuff +
                ", attack=" + attack +
                ", defStuff=" + defStuff +
                ", health=" + health +
                '}';
    }
}
