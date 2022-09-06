package character.stuff.Atk;

import character.stuff.EquipmentOffensive;

public class Weapon extends EquipmentOffensive {
    public Weapon(){
        super(
                "ATK - Name of the Weapon",
                0
        );
    }
    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                '}';
    }
}
