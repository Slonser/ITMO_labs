package lab;

import lab.alive.Alive;

import java.util.Objects;

public class Action<O> implements Executable{

    private Alive owner;
    private String skillName;
    private O arg;

    public Action(Alive owner, String skillName, O arg) {
        this.owner = owner;
        this.skillName = skillName;
        this.arg = arg;
    }

    @Override
    public Object execute(Object a) {
        for (var act: owner.getSkills()) {
            if(skillName.equals(act.getName()))
                return ((Executable)act).execute(arg);
        }
        return null;
    }
}
