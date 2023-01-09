package lab.alive;

import lab.Locations;
import lab.item.Item;
import lab.skill.PlayingSkill;

import java.util.ArrayList;

public class Carlson extends Human {
    public Carlson() {
        super("Карлсон", Locations.Street, new ArrayList<>(), new ArrayList<Item>());
        Item cup = new Item("кружка прежде принадлежвашая малышу", 34);
        this.addItem(cup);
        this.addItem(new Item("Башмоки", 400));
        this.addSkill(new PlayingSkill("Играть", "играет с", this));
    }
}
