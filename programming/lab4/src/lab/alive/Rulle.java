package lab.alive;

import lab.Locations;
import lab.item.Item;

import java.util.ArrayList;

public class Rulle extends Human {
    public Rulle() {
        super("Рулле", Locations.Neighbour, new ArrayList<>(), new ArrayList<Item>());
    }
}
