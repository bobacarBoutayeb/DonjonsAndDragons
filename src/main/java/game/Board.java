package game;

import character.pnj.Dragon;
import character.pnj.Goblin;
import character.stuff.Def.RegularPotion;

import java.util.ArrayList;
import java.util.Collections;

public class Board {
    protected ArrayList<Case> cells = new ArrayList<>();
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
/*
    public void makeInteraction(Toon toon, int pos) {
        if(pos < cells.size()){
            cells.get(pos).interactionWithCase(toon);
        }
    }*/
    protected Case getCell(int index) {
        return this.cells.get(index);
    }

//    protected Case contentCellPlayer(Case casePlayer){
////        casePlayer =
//    }
}
