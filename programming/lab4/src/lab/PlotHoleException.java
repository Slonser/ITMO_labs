package lab;

import lab.alive.Alive;
import lab.skill.Skill;

import java.util.Formatter;

public class PlotHoleException extends Exception {
    Skill skill;
    Alive owner;
    String info;

    public PlotHoleException(String message) {
        super(message);
    }

    public PlotHoleException(Skill skill, Alive owner, String info) {
        this(new Formatter().format("%s called by %s have plot hole: %s",
                skill.getName(),
                owner.getName(),
                info).toString());
        this.skill = skill;
        this.owner = owner;
        this.info = info;
    }

    public Skill getSkill() {
        return skill;
    }

    public Alive getOwner() {
        return owner;
    }

    public String getInfo() {
        return info;
    }
}
