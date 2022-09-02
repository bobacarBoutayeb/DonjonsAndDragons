package Game;

abstract class EquipmentDefensive {
    //Attributs
    protected String name;
    protected int defense;

    // Constructor

    public EquipmentDefensive(String name, int defense){
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

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
