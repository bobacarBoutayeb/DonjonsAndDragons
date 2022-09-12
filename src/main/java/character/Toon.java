package character;

import character.stuff.EquipmentDefensive;
import character.stuff.EquipmentOffensive;
import game.Case;
import interactions.Fighter;

/**
 * Base for each characters in the game
 */
public abstract class Toon implements Case, Fighter {
    /**
     * String name - Name of the toon
     */
    protected String name;
    /**
     * int position - Position of the toon, 0 by default for the beginning
     */
    protected int position = 0;
    /**
     * EquipmentOffensive atkStuff - Offensive stuff for toon 
     */
    protected EquipmentOffensive atkStuff;
    /**
     * int attack - Attack of the toon
     */
    protected int attack;
    /**
     * EquipmentDefensive defStuff - Defensive stuff for toon
     */
    protected EquipmentDefensive defStuff;
    /**
     * int health - Health of the toon
     */
    protected int health;

    // Constructors
    /**
     * Toon construct
     */
    public Toon(){
        // Construct
    }
    /**
     * Toon construct with 2 parameters, attack and health
     */
    public Toon(int attack, int health){
        this.attack = attack;
        this.health = health;
    }
    public Toon(int minAttack, int maxAttack, int minHealth, int maxHealth){
        this.attack = randomStat(minAttack,maxAttack);
        this.health = randomStat(minHealth,maxHealth);
    }

    // Methods
    /**
     * Static method for getting random attack and health in the good range with two parameters
     * @param minStat - Low limit
     * @param maxStat - Max limit
     * @return randomStat
     */
    private int randomStat(int minStat, int maxStat){
        int rangeMinMaxStat = maxStat - minStat;
        return (int) (((Math.random() * (1000000)) % rangeMinMaxStat) + minStat);
    }

    /**
     * Toon contracts for interaction with a toon
     */

    /**
     * @param toon - Interaction with a Toon.
     */
    @Override
    public void interactionWithCase(Toon toon) {
    }

    /**
     * Fighter contracts with a toon
     */
    /**
     * Engage fight and bless the Toon
     * @param toon - Toon the instance face
     * @return toon updated after Attack
     */
    @Override
    public Toon fighterEngage(Toon toon) {
        System.out.println("Fight!");
        toon.health = toon.health - this.attack;
        return toon;
    }
    /**
     * Defense against a Toon
     * @param toon - Toon that attack the actual instance
     * @return toon updated after Defense
     */
    @Override
    public Toon fighterDefend(Toon toon) {
        System.out.println("Clench your teeth and survive !");
        this.health = this.health - toon.attack;
        return this;
    }
    /**
     * Escape fight against the Toon
     * @param toon - Toon the instance face
     * @return toon updated
     */
    @Override
    public Toon fighterEscape(Toon toon) {
        System.out.println("Run Forest, run!");
        return toon;
    }

    // Getters & Setters
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
