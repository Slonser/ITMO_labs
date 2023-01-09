package lab.alive;

import lab.Locations;
import lab.item.Item;
import lab.skill.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Human extends Alive {


    private final ArrayList<Skill> baseSkill = new ArrayList<Skill>(
            List.of(
                    new SoundSkill("Разговор", "сказал", this),
                    new SoundSkill("Желание сказать", "хотел сказать", this),
                    new EatSkill("Есть", "уплетает", this),
                    new EatSkill("Пить", "выпивает", this),
                    new ThinkingSkill("Думать", "думает о", this),
                    new MoveSkill("Перемещение", "подсел на крыльцо", this),
                    new KeepSkill("Держать", "держит как это делают маленькие дети", this),
                    new RemoveItemSkill("Снять одежду", "снял", this)
            )
    );
    private Emotions emotion = Emotions.Normal;

    public Human() {
        super("Человек", Locations.UNKNOWN, new ArrayList<>());
        addSkill(baseSkill);
    }

    public Human(String name) {
        super(name);
    }

    public Human(String name, Locations locations, ArrayList<Skill> skills, ArrayList<Item> items) {
        super(name, locations, skills);
        addSkill(baseSkill);
        this.inventory = new Inventory(items);
    }

    public Emotions getEmotion() {
        return emotion;
    }

    public void setEmotion(Emotions emotion) {
        System.out.printf("%s стал %s.\n", this.getName(), emotion);
        this.emotion = emotion;
    }

    public void makeHappy() {
        this.setEmotion(Emotions.Happy);
    }

    public void makeSad() {
        this.setEmotion(Emotions.SAD);
        System.out.printf("%s %s.", this.getName(), emotion);
    }

    public void addItem(Item item) {
        this.inventory.add(item);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(baseSkill, human.baseSkill) && emotion == human.emotion && Objects.equals(inventory, human.inventory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseSkill, emotion, inventory);
    }
}
