package lab.skill;

import lab.Executable;
import lab.Locations;
import lab.PlotHoleException;
import lab.alive.Alive;

public class MoveSkill extends Skill implements Executable<Locations, Void> {
    public MoveSkill(String name, String description, Alive owner) {
        super(name, description, owner);
    }

    @Override
    public Void execute(Locations arg) throws PlotHoleException {
        if (owner.getLocations() == arg)
            throw new PlotHoleException(this, owner, "смена локации на ту же самую");
        System.out.printf("%s перешел к %s.\n", owner.getName(), arg);
        return null;
    }
}
