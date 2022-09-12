package character.stuff;

import character.Toon;
import game.Case;

public abstract class EquipmentOffensive implements Case {

    // Attributs
    protected String name;
    protected int attack;

    // Constructor
    protected EquipmentOffensive(String name, int attack){
        this.name = name;
        this.attack = attack;
    }
    /* Construct

    public EquipmentOffensive(Character character){
        if ( character.getType() == "warrior"){
            this.
            this.player = this.weapon;
            this.player = this.attack;
        } else {
            this.player = this.name;
            this.player = this.spell;
            this.player = this.attack;
        }
    }*/


    @Override
    public void interactionWithCase(Toon toon) {
        System.out.println("Attack stuff");
    }

//    @Override
//    public Toon fight(Toon toon) {
//        return null;
//    }
//
//    @Override
//    public Toon defend(Toon toon) {
//        return null;
//    }
//
//    @Override
//    public Toon fly(Toon toon) {
//        return null;
//    }

    // toString
    @Override
    public String toString() {
        return "EquipmentOffensive{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                '}';
    }
}
