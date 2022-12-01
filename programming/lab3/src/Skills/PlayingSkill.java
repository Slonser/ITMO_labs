package Skills;

import Items.Item;

public class PlayingSkill extends Skill {

    public  PlayingSkill(String info){
        super("PlayingSkill", info);
    }
    public String execute(Item item){
        System.out.printf("Playing with %s (%s)",item.getName(),getInfo());
        return "";
    }

    @Override
    public String toString(){
        return "Способность позволяющая играть";
    }
    public String describe(){
        return toString();
    }

    public void print(){
        System.out.println(describe());
    }
}
