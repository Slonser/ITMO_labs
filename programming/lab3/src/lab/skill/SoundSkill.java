package lab.skill;

import lab.Executable;
import lab.alive.Alive;

public class SoundSkill extends Skill implements Executable<String, Void> {
    public SoundSkill(String name, String description, Alive alive) {
        super(name, description,alive);
    }

    @Override
    public Void execute(String arg) {
        System.out.printf("%s \"%s\".\n",description,arg);
        return null;
    }


}
