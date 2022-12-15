package lab.item;

import lab.alive.Alive;
import lab.alive.Human;

public class Juice extends Item implements Eatable{

    public Juice(String name, int weight) {
        super(name, weight);
    }

    @Override
    public int eat(Alive alive) {
        int ans = this.weight;
        this.weight = 0;
        if(alive instanceof Human)
            ((Human)alive).makeHappy();
        return ans;
    }
}
