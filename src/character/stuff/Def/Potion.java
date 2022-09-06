package character.stuff.Def;

import character.stuff.EquipmentDefensive;

public class Potion extends EquipmentDefensive {

    @Override
    public String toString() {
        return "Potion{" +
                "name='" + name + '\'' +
                ", defense=" + defense +
                '}';
    }
}
