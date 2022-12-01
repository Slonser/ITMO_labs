package Skills;

import Alives.Printable;
import Items.Item;

import java.util.Objects;

public abstract class Skill implements Printable {
    public String getName() {
        return name;
    }

    private String name;

    public String getInfo() {
        return info;
    }

    private  String info;
    public Skill(String name,String info){
        this.name = name;
        this.info = info;
    }

    public abstract String execute(Item item);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return Objects.equals(name, skill.name) && Objects.equals(info, skill.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, info);
    }
}
