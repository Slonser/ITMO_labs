package lab.skill;

import lab.Executable;
import lab.alive.Human;

public class RemoveItemSkill extends Skill implements Executable<String, Void> {
    public RemoveItemSkill(String name, String description, Human owner) {
        super(name, description, owner);
    }

    @Override
    public Void execute(String arg) {
        System.out.printf("%s %s \"%s.\"\n", owner.getName(), description, arg);
        owner.inventory.remove(arg);
        return null;
    }
}