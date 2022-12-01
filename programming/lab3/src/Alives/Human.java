package Alives;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import Skills.*;
import Items.*;

public class Human extends Alive {


    String name;
    List<Skill> skills = new ArrayList<>();
    List<Item> items = new ArrayList<>();
    Emotions emotion;

    Locations location;
    public Human(){
        super();
    }

    public void addSkill(Skill skill){
        skills.add(skill);
    }

    public void addSkill(Skill[] skill){
        for (var x: skill) {
            addSkill(x);
        }
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void addItems(Item[] item){
        for (var x: item) {
            addItem(x);
        }
    }

    public void sendGift(Item item, Human reciever){
        if(!items.contains(item))
            return;
        items.remove(item);
        reciever.addItem(item);
    }

    public Human(String name){
        this();
        setName(name);
    }
    public String getName() {
        return name;
    }
    public void seat(String destination){
        System.out.printf("%s присел на %s%n", name, destination);
    }

    public void setEmotion(Emotions emotion){
        this.emotion = emotion;
        System.out.printf("%s %s%n",name,emotion.name());
    }

    public void setLocation(Locations location){
        this.location = location;
    }
    public String activateSkill(String skillName,Item item){
        for (var skill: skills) {
            if(Objects.equals(skill.getName(), skillName))
                return skill.execute(item);
        }
        return "";
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("Human with name %s", this.name);
    }
    @Override
    public String describe(){
        return toString();
    }

    @Override
    public void print() {
        System.out.println(describe());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                new HashSet<>(skills).containsAll(human.skills) && new HashSet<>(human.skills).containsAll(skills)
                && new HashSet<>(items).containsAll(human.items) && new HashSet<>(human.items).containsAll(items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, skills, items);
    }
}
