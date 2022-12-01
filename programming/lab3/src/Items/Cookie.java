package Items;

import Alives.Printable;
import Items.Item;
import Skills.Eatable;

public class Cookie extends Item implements Eatable, Printable {

    public Cookie(){
        super("булочки");
    }
    float satiety = 50;
    @Override
    public String describe(){
        return "Вкусная булочка";
    }
    @Override
    public void print(){
        System.out.println(describe());
    }

    public float drink(float percent){return 0f;}

    public  float eat(float percent){
        satiety -= satiety * percent;
        satiety = Math.max(0,satiety);
        return satiety;
    }

}
