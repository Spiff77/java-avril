package org.humanbooster.monprojet.model;

import java.util.Objects;

public class Orc {

    private String name = "NameLess";
    private int force;
    private int health;
    private String clan;

    public Orc(int force, int health) {
        this.force = force;
        this.setHealth(health);
    }

    public Orc(String name, int force, int health) {
        this(force, health);
        this.name = name;
    }

    public Orc(String name, String clan, int force, int health) {
        this(name, force, health);
        this.clan = clan;
    }

    public void attack(Orc o){
        o.health -= this.force;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health > 100 ? 100 : health;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orc)) return false;
        Orc orc = (Orc) o;
        return Objects.equals(name, orc.name) && Objects.equals(clan, orc.clan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clan);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orc{");
        sb.append("name='").append(name).append('\'');
        sb.append(", force=").append(force);
        sb.append(", health=").append(health);
        sb.append(", clan='").append(clan).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
