package lab.alive;

import lab.Locations;
import lab.skill.Skill;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Alive {


    public Alive(String name, Locations locations, ArrayList<Skill> skills) {
        this.name = name;
        this.locations = locations;
        this.skills = skills;
    }

    public Alive() {
        this.name = "Безымянный";
    }

    public Alive(String name, int health, int hungry) {
        this.name = name;
        this.health = health;
        this.hungry = hungry;
    }

    public Alive(String name){
        this.name = name;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alive alive = (Alive) o;
        return health == alive.health && hungry == alive.hungry && state == alive.state && Objects.equals(name, alive.name) && locations == alive.locations && Objects.equals(skills, alive.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, name, health, hungry, locations, skills);
    }

    @Override
    public String toString() {
        return getName();
    }


    public enum State{
        Alive("живой"),
        Dead("мертвый"),
        Working("занят делом");
        private final String state;
        State(String state) {
            this.state = state;
        }
        String getState(){
            return this.state;
        }

    }

    public State getState() {
        return state;
    }

    private State state = State.Alive;
    public String getName() {
        return name;
    }

    private final String name;

    public int getHealth() {
        return health;
    }

    private int health = 100;

    public int getHungry() {
        return hungry;
    }

    private int hungry = 100;

    public Locations getLocations() {
        return locations;
    }

    private Locations locations = Locations.UNKNOWN;


    private ArrayList<Skill> skills = new ArrayList<>();

    void addSkill(Skill skill){
        skills.add(skill);
    }

    void addSkill(ArrayList<Skill> skill){
        skills.addAll(skill);
    }


}
