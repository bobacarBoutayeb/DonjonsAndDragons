package game;

import character.pnj.Ennemy;
import character.stuff.Atk.Spell;
import character.stuff.Def.Heal;
import character.stuff.EquipmentDefensive;
import character.stuff.EquipmentOffensive;
import interactions.Interact;

import java.util.ArrayList;

public class Board {
    protected ArrayList<Interact> board = new ArrayList<>();
    protected void initBoard() {
        board.add(0,null);
        board.add(1, new Ennemy());
        board.add(2, new Spell());
        board.add(3, new Heal());
    }

    protected getBoard
}
