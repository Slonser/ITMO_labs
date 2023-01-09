package lab.skill;

import lab.Executable;
import lab.alive.Alive;
import lab.item.Item;

public class PlayingSkill extends Skill implements Executable<Item, Void> {
    public PlayingSkill(String name, String description, Alive owner) {
        super(name, description, owner);
    }

    @Override
    public Void execute(Item arg) {
        System.out.printf("%s %s \"%s.\"\n", owner.getName(), description, arg);
        return null;
    }
}
