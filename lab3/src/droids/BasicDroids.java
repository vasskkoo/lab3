package droids;

public class BasicDroids
{
    public String name;
    public int health;
    public int damage;
    public int percentOfDefend;
    public int vampirism;
    public BasicDroids(String name, int health, int damage, int percentOfDefend, int vampirism)
    {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.percentOfDefend = percentOfDefend;
        this.vampirism = vampirism;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPercentOfDefend() {
        if ((int)(Math.random()) % 10 > 5) return percentOfDefend / 100;
        else return 1;
    }

    public void setPercentOfDefend(int percentOfDefend) {
        this.percentOfDefend = percentOfDefend;
    }

    public int getVampirism() {
        if ((int)(Math.random() % 10) > 5) return vampirism / 100;
        else return 1;
    }

    public void setVampirism(int vampirism) {
        this.vampirism = vampirism;
    }

}