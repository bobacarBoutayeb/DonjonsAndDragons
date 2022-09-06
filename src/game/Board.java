package game;

import character.pnj.Dragon;
import character.pnj.Goblin;
import character.stuff.Def.RegularPotion;
import interactions.Interact;

import java.util.ArrayList;
import java.util.Collections;

public class Board {
    protected ArrayList<Interact> cells = new ArrayList<>();
    protected void initBoard() {
        for (int caseIndex = 0; caseIndex < 65; caseIndex++){
            switch (caseIndex) {
                case 6, 10, 13, 18, 22 -> cells.add(new Goblin());
                case 3, 7, 12, 17, 21 -> cells.add(new RegularPotion());
                case 4, 8, 14, 20 -> cells.add(new Dragon());
                default -> cells.add(new EmptyCase());
            }
        }
        Collections.shuffle(cells); // 7.3 random
    }
    protected Interact getCell(int index) {
        return this.cells.get(index);
    }
}
