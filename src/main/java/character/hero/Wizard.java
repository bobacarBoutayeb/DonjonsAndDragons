package character.hero;

import character.Toon;

public class Wizard extends Toon {

    private static final int minHealthWizard = 5;
    private static final int maxHealthWizard = 10;
    private static final int minAtkWizard = 8;
    private static final int maxAtkWizard = 15;

    public Wizard() {
        super(minAtkWizard,maxAtkWizard, minHealthWizard, maxHealthWizard);
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
