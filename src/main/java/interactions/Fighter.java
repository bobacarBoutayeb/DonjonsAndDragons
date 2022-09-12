package interactions;

import character.Toon;

public interface Fighter {
    Toon fighterEngage(Toon toon);
    Toon fighterDefend(Toon toon);
    Toon fighterEscape(Toon toon);
}
