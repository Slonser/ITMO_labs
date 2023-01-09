package lab.alive;

import lab.Locations;
import lab.item.Item;

import java.util.ArrayList;

public class Junior extends Human {
    public Junior() {
        super("Малыш", Locations.Street, new ArrayList<>(), new ArrayList<Item>());
    }
}
