package character.stuff;

public abstract class EquipmentDefensive {

    //Attributs
    protected String name;
    protected int defense;

    // Constructor
    protected EquipmentDefensive(String name, int defense){
        this.name = name;
        this.defense = defense;
    }

    //toString
    @Override
    public String toString() {
        return "EquipmentDefensive{" +
                ", name='" + name + '\'' +
                ", defense=" + defense +
                '}';
    }
}
