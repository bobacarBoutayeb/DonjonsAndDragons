package character.pnj;

import character.Toon;

public abstract class Ennemy extends Toon {
    @Override
    public void interactionWithCase(Toon toon) {
        System.out.println("Ennemy vs " + toon);
    }
//    @Override
//    public Toon fight(Toon toon) {
//        return null;
//    }
//
//    @Override
//    public Toon defend(Toon toon) {
//        return null;
//    }
//
//    @Override
//    public Toon fly(Toon toon) {
//        return null;
//    }

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
