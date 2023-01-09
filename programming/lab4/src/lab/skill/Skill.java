package lab.skill;

import lab.alive.Alive;

public abstract class Skill {
    String name;
    String description;

    Alive owner;

    public Skill(String name, String description, Alive owner) {
        this.name = name;
        this.description = description;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
