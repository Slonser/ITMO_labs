package Skills;
import Items.*;
public class EatSkill extends Skill {

    public  EatSkill(String info){
        super("EatSkill", info);
    }
    public String execute(Item item){
        Eatable it  = (Eatable) item;
        System.out.printf("Уплетает %s%n", item.getName());
        if(it.eat(0.5f) == 0)
            return "Done";

        return "";
    }

    @Override
    public String toString(){
        return "Skills that provides eating abilities";
    }
    public String describe(){
        return toString();
    }

    public void print(){
        System.out.println(describe());
    }
}
