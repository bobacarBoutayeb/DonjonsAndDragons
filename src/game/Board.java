package game;

import character.pnj.Dragon;
import character.pnj.Ennemy;
import character.pnj.Goblin;
import character.pnj.Wizard;
import character.stuff.Atk.*;
import character.stuff.Def.BigPotion;
import character.stuff.Def.RegularPotion;
import character.stuff.Def.Shield;
import interactions.Interact;

import java.util.ArrayList;

public class Board {
    protected ArrayList<Interact> cells = new ArrayList<>();
    protected void initBoard() {
        cells.add(0,null);
        cells.add(1, new Ennemy());
        cells.add(2, new Spell());
        cells.add(3, new Shield());
        cells.add(4, new Dragon());
        cells.add(5, new Wizard());
        cells.add(6, new Goblin());
        cells.add(7, new Mace());
        cells.add(8, new Sword());
        cells.add(9, new Lightning());
        cells.add(10, new Fireball());
        cells.add(11, new RegularPotion());
        cells.add(12, new BigPotion());
    }

    protected ArrayList getCells() {
        return this.cells;
    }
}
