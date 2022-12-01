package Items;

import Alives.Printable;
import Items.Item;
import Skills.Eatable;

public class Juice  extends Item implements Eatable, Printable {

    public  Juice(){
        super("Сок");
    }
    private float waterThirst = 50;
    @Override
    public String describe(){
        return "Вкусный сок";
    }
    @Override
    public void print(){
        System.out.println(describe());
    }

    public float drink(float percent){
        waterThirst = Math.min(0, waterThirst - percent*waterThirst);
        return waterThirst;
    }

    public  float eat(float percent){
        return 0f;
    }
}
