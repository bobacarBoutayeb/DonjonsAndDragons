package game;

import character.Toon;
import interactions.Interact;

public class EmptyCase implements Interact {
    @Override
    public void interact(Toon toon) {
        System.out.println("I'm empty lucky toon.");
    }
}
