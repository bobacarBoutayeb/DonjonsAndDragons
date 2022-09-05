package interactions;

import character.Toon;

public interface Fight extends Interaction {
    Interaction fight(Toon toon);
}
