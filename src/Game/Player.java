package Game;
public class Player {
    //Attributs
    private String name;
    private int health;
    private int attack;
    private int minHealthWarrior = 5;
    private int minHealthWizard = 8;
    private int maxHealthWizard = 15;
    private int maxHealthWarrior = 15;

    private EquipmentOffensive atkStuff;
    private EquipmentDefensive defStuff;

    private String type;
    public static String[] typePlayer =  {"warrior", "wizard"};
    /* Approche ArrayList
    public static ArrayList<String> typePlayer = new ArrayList<>();
    */

    //Constructs
    public Player(){
        /* ArrayList
        typePlayer.add("guerrier");
        typePlayer.add("magicien");
        */
        this.atkStuff = new EquipmentOffensive("cool",10);
        this.defStuff = new EquipmentDefensive("protector", 10);
    }

    public Player(String nameAssigned)
    {
        this.name = nameAssigned;
        this.atkStuff = new EquipmentOffensive("cool",10);
        this.defStuff = new EquipmentDefensive("protector", 10);
    }
    public Player(String nameAssigned, int healthAssigned, int attackAssigned)
    {
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
                ", minHealthWarrior=" + minHealthWarrior +
                ", minHealthWizard=" + minHealthWizard +
                ", maxHealthWizard=" + maxHealthWizard +
                ", maxHealthWarrior=" + maxHealthWarrior +
                ", atkStuff=" + atkStuff +
                ", defStuff=" + defStuff +
                '}';
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

    // Methods

}
