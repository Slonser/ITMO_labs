package lab.skill;

import lab.Executable;
import lab.alive.Alive;
import lab.item.Item;

public class ThinkingSkill extends Skill implements Executable<String,Void>{
    public ThinkingSkill(String name, String description, Alive owner) {
        super(name, description, owner);
    }

    @Override
    public Void execute(String arg) {
        System.out.printf("%s %s \"%s.\".\n",owner.getName(),description, arg);
        return null;
    }
}
