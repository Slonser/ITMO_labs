package lab.item;

import java.util.Objects;

public class Item {
    String name;
    int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return weight == item.weight && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}
