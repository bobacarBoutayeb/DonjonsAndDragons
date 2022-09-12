package game;

import character.Toon;

public class EmptyCase implements Case {
    @Override
    public void interactionWithCase(Toon toon) {
        System.out.println(" I'm empty, lucky toon.");
    }
}
