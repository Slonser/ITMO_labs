package Attacks.PhysicalAttacks;


import ru.ifmo.se.pokemon.*;

public class RazorLeaf extends PhysicalMove {
    public RazorLeaf(){
        super(Type.GRASS,55,95);
    }

    @Override
    protected String describe() {
        return "uses RazorLeaf";
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        if (att.getStat(Stat.SPEED) / 512.0D * 3 > Math.random()) {
            System.out.println("Critical hit!");
            return 2.0D;
        }
        return 1.0D;
    }
}
