package game;

import character.hero.HeroOutOfBound;

public class Main {
    public static void main(String[] args) throws HeroOutOfBound {
        Game game = new Game();
        game.engine();
    }
}
