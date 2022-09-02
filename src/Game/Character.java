package Game;

abstract class Character {

    protected String name;
    protected int position;
    protected EquipmentOffensive atkStuff;
    protected int attack;
    protected EquipmentDefensive defStuff;
    protected int health;
    protected int minHealth;
    protected int maxHealth;
    public Character(String name, int attack, int health, int minHealth, int maxHealth){
        this.name = name;
        this.atkStuff = new EquipmentOffensive("atk",0);
        this.attack = attack;
        this.defStuff = new EquipmentDefensive("def",0);
        this.health = health;
        this.minHealth = minHealth;
        this.maxHealth = maxHealth;
    }

    // Methods
    public static int getRandomMaxHealth(int maxHealth){
        return (int) (((Math.random() * (1000000)) % maxHealth) +1);
    }

}
