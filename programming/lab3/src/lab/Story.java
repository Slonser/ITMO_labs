package lab;

import lab.alive.*;
import lab.item.Cookie;
import lab.item.Eatable;
import lab.item.Item;
import lab.item.Juice;

import java.util.ArrayList;
import java.util.List;

public class Story {

    private Carlson carlson = new Carlson();
    private Fille fille = new Fille();
    private FrekenBok frekenBok = new FrekenBok();
    private Julius julius = new Julius();
    private Junior junior = new Junior();
    private Rulle rule = new Rulle();
    ArrayList<Action> story = new ArrayList<Action>(List.of(
            new Action<Locations>(carlson,"Перемещение",Locations.Porch),
            new Action<Locations>(junior,"Перемещение",Locations.Porch),
            new Action<String>(junior,"Думать","том, как трудно обеспечить безопасность Карлсона"),
            new Action<Eatable>(carlson,"Есть",new Cookie("булочки",123)),
            new Action<Eatable>(carlson,"Пить",new Juice("сок",123)),
            new Action<Item>(carlson,"Держать", carlson.getItems().get(0))

            ));

    void run(){
        for (var action: story) {
            action.execute(null);
        }
    }
}
