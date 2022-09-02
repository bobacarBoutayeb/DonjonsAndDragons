package Game;

public class Hero extends Character{
    //Attributs
    public Hero() {
        this.menu = new Menu();
        this.atkStuff = new EquipmentOffensive("cool",10);
        this.defStuff = new EquipmentDefensive("protector", 10);
    }
    public Hero(String nameAssigned) {
        this.menu = new Menu();
        this.name = nameAssigned;
        this.atkStuff = new EquipmentOffensive("cool",10);
        this.defStuff = new EquipmentDefensive("protector", 10);
    }
    public Hero(String nameAssigned, int healthAssigned, int attackAssigned) {
        this.menu = new Menu();
        this.name = nameAssigned;
        this.health = healthAssigned;
        this.attack = attackAssigned;
        this.atkStuff = new EquipmentOffensive("cool",10);
        this.defStuff = new EquipmentDefensive("protector", 10);
    }
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", position=" + position +
                ", minHealthWarrior=" + minHealthWarrior +
                ", minHealthWizard=" + minHealthWizard +
                ", maxHealthWizard=" + maxHealthWizard +
                ", maxHealthWarrior=" + maxHealthWarrior +
                ", atkStuff=" + atkStuff +
                ", defStuff=" + defStuff +
                '}';
    }

    // Methods

    public void setPlayerName() {
        this.setName(this.menu.getPlayerName());
    }

    // Getters & Setters
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
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getMinHealthWarrior() {
        return minHealthWarrior;
    }
    public void setMinHealthWarrior(int minHealthWarrior) {
        this.minHealthWarrior = minHealthWarrior;
    }
    public int getMinHealthWizard() {
        return minHealthWizard;
    }
    public void setMinHealthWizard(int minHealthWizard) {
        this.minHealthWizard = minHealthWizard;
    }
    public int getMaxHealthWizard() {
        return maxHealthWizard;
    }
    public void setMaxHealthWizard(int maxHealthWizard) {
        this.maxHealthWizard = maxHealthWizard;
    }
    public int getMaxHealthWarrior() {
        return maxHealthWarrior;
    }
    public void setMaxHealthWarrior(int maxHealthWarrior) {
        this.maxHealthWarrior = maxHealthWarrior;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
}
