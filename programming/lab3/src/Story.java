import Alives.Emotions;
import Alives.Human;
import Alives.Locations;
import Items.Cookie;
import Items.Item;
import Items.Juice;
import Skills.*;

import java.util.Objects;

public class Story {
    void run(){
        Item voidItem = new Item("void");
        Human carlson = new Human("carlson");
        Human malish = new Human("malish");
        Human rulle = new Human("rulle");
        Human fille = new Human("fille");
        Human frekenbok = new Human("frekenbok");
        Human ulius = new Human("ulius");

        Item cookie = new Cookie();
        Item juice = new Juice();
        carlson.addItems(new Item[]{cookie});
        malish.addItems(new Item[]{juice});


        carlson.addSkill(new Skill[] {new DrinkSkill("сок"),new EatSkill("булочки"),new PlayingSkill("двумя руками")});
        malish.addSkill(new ThinkingSkill("безопастность карлсона"));

        malish.sendGift(juice,carlson);

        carlson.setLocation(Locations.street);
        malish.setLocation(Locations.street);

        carlson.seat("крыльцо");
        malish.seat("крыльцо");
        frekenbok.setLocation(Locations.home);
        ulius.setLocation(Locations.home);

        malish.setEmotion(Emotions.SAD);
        malish.activateSkill("ThinkingSkill",voidItem);


        carlson.activateSkill("EatSkill", cookie);
        while(!Objects.equals(carlson.activateSkill("DrinkSkill", juice), "Done")){}

        carlson.activateSkill("PlayingSkill", juice);
    }
}
