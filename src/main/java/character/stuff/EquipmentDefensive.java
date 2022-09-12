package character.stuff;

import character.Toon;
import game.Case;

public abstract class EquipmentDefensive implements Case {

    //Attributs
    protected String name;
    protected int defense;

    // Constructor
    protected EquipmentDefensive(){}
    protected EquipmentDefensive(String name, int defense){
        this.name = name;
        this.defense = defense;
    }
    @Override
    public void interactionWithCase(Toon toon) {
        System.out.println("Je suis un equipement defensif");
        System.out.println("J'interagis avec " + toon);
    }
//    @Override
//    public Toon fight(Toon toon) {
//        return null;
//    }
//    @Override
//    public Toon defend(Toon toon) {
//        return null;
//    }
//    @Override
//    public Toon fly(Toon toon) {
//        return null;
//    }

    //toString
    @Override
    public String toString() {
        return "EquipmentDefensive{" +
                "Name:'" + name + '\'' +
                ", Defense:" + defense +
                '}';
    }
}
