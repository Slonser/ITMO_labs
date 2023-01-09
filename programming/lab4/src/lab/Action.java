package lab;

import lab.alive.Alive;

public class Action<O> implements Executable {

    private final Alive owner;
    private String skillName;
    private final O arg;

    private Executable action = null;

    public Action(Alive owner, String skillName, O arg) {
        this.owner = owner;
        this.skillName = skillName;
        this.arg = arg;
    }

    public Action(Alive owner, Executable action, O arg) {
        this.owner = owner;
        this.action = action;
        this.arg = arg;
    }

    @Override
    public Object execute(Object a) throws PlotHoleException {
        if (this.action == null) {
            for (var act : owner.getSkills()) {
                if (skillName.equals(act.getName()))
                    this.action = (Executable) act;
            }
        }
        if (this.action == null)
            throw new ActionNotFoundException(this.owner.getName(), skillName);
        return action.execute(arg);

    }

    public String getSkillName() {
        return skillName;
    }
}
