package lab.item;

import lab.alive.Alive;
import lab.alive.Human;

public class Cookie extends Item implements  Eatable{
    public Cookie(String name, int weight) {
        super(name, weight);
    }


    @Override
    public int eat(Alive alive) {
        int ans = this.weight/4;
        this.weight = 0;
        return ans;
    }
}
