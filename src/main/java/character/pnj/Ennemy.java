package character.pnj;

import character.Toon;

public abstract class Ennemy extends Toon {
    @Override
    public void interactionWithCase(Toon toon) {
        System.out.println("Ennemy vs " + toon);
    }

    @Override
    public String toString() {
        return "Ennemy{" +
                "Name:'" + name + '\'' +
                ", position:" + position +
                ", atkStuff:" + atkStuff +
                ", attack:" + attack +
                ", defStuff:" + defStuff +
                ", health:" + health +
                '}';
    }
}
