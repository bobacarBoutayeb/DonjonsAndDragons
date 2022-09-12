package character.stuff.Atk;

import character.stuff.EquipmentOffensive;

public class Spell extends EquipmentOffensive {
    public Spell(){
        super(
                "ATK - Name of the Spell",
                0
        );
    }
    @Override
    public String toString() {
        return "Spell{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                '}';
    }
}
