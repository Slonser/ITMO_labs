package lab.skill;

import lab.Executable;
import lab.alive.Alive;
import lab.item.Eatable;
import lab.item.Item;

public class EatSkill extends Skill implements Executable<Eatable, Integer> {
    public EatSkill(String name, String description, Alive owner) {
        super(name, description, owner);
    }

    @Override
    public Integer execute(Eatable arg) {
        System.out.printf("%s %s %s.\n", owner.getName(), this.description, ((Item) arg).getName());
        return arg.eat(owner);
    }
}
