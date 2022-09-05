package character;

import character.stuff.EquipmentDefensive;
import character.stuff.EquipmentOffensive;

public abstract class Perso {
    protected String name;
    protected int position = 0;
    protected EquipmentOffensive atkStuff;
    protected int attack;
    protected EquipmentDefensive defStuff;
    protected int health;
    public Perso(int attack, int health){
        this.attack = attack;
        this.health = health;
    }

    // Methods
    public static int randomStat(int minStat, int maxStat){
        int rangeMinMaxHealth = maxStat - minStat;
        return (int) (((Math.random() * (1000000)) % rangeMinMaxHealth) + minStat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public EquipmentOffensive getAtkStuff() {
        return atkStuff;
    }

    public void setAtkStuff(EquipmentOffensive atkStuff) {
        this.atkStuff = atkStuff;
    }

    public EquipmentDefensive getDefStuff() {
        return defStuff;
    }

    public void setDefStuff(EquipmentDefensive defStuff) {
        this.defStuff = defStuff;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {

        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
