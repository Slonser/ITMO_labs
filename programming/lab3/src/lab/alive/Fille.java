package lab.alive;

import lab.Locations;
import lab.item.Item;
import lab.skill.PlayingSkill;

import java.util.ArrayList;

public class Fille extends Human{
    public Fille(){
        super("Филле", Locations.Neighbour, new ArrayList<>(),new ArrayList<Item>());
    }
}
