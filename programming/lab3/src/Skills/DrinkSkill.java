package Skills;
import Items.*;
public class DrinkSkill extends Skill {

    public  DrinkSkill(String info){
        super("DrinkSkill", info);
    }
    public String execute(Item item){
        Eatable it  = (Eatable) item;
        System.out.printf("Запивает используя %s%n", item.getName());
        if(it.drink(0.5f) == 0)
            return "Done";
        return "";
    }

    @Override
    public String toString(){
        return "Способность позволяющая пить";
    }
    public String describe(){
        return toString();
    }

    public void print(){
        System.out.println(describe());
    }
}
