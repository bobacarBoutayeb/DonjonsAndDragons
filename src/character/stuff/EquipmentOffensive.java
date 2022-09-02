package character.stuff;

public abstract class EquipmentOffensive {

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

    // toString
    @Override
    public String toString() {
        return "EquipmentOffensive{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                '}';
    }
}
