package character.pnj;

import character.Toon;
import interactions.Interact;

public class Ennemy implements Interact {
    @Override
    public void interact(Toon toon) {
        System.out.println("Ennemy vs " + toon);
    }
    @Override
    public Toon fight(Toon toon) {
        return null;
    }

    @Override
    public Toon defend(Toon toon) {
        return null;
    }

    @Override
    public Toon fly(Toon toon) {
        return null;
    }
}
