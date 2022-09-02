package Game;

public class EquipmentOffensive {

    // Attributs
    private String name;
    private int attack;

    // Constructor

    public EquipmentOffensive(String name, int attack){
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

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
