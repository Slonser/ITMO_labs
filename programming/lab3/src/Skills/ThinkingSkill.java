package Skills;
import Items.*;
public class ThinkingSkill extends Skill {

    public  ThinkingSkill(String info){
        super("ThinkingSkill", info);
    }
    public String execute(Item item){
        System.out.printf("Думает о %s%n", getInfo());
        return "";
    }

    @Override
    public String toString(){
        return "Skills that provides thinking abilities";
    }
    public String describe(){
        return toString();
    }

    public void print(){
        System.out.println(describe());
    }
}
