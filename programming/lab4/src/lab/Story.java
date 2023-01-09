package lab;

import lab.alive.*;
import lab.item.Cookie;
import lab.item.Eatable;
import lab.item.Item;
import lab.item.Juice;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Story {

    private final Carlson carlson = new Carlson();
    private final Fille fille = new Fille();
    private final FrekenBok frekenBok = new FrekenBok();
    private final Julius julius = new Julius();
    private final Junior junior = new Junior();
    private final Rulle rule = new Rulle();
    ArrayList<Action> story = new ArrayList<>(List.of(
            new Action<Void>(fille, new Executable<Void, Void>() {
                @Override
                public Void execute(Void arg) throws PlotHoleException {
                    System.out.println("Рулле и Филле вскочили как встрепанные");
                    return null;
                }
            }, null),
            new Action<String>(fille, "Желание сказать", "Рулле, нас нет"),
            new Action<Locations>(carlson, "Перемещение", Locations.Porch),
            new Action<Locations>(junior, "Перемещение", Locations.Porch),
            new Action<String>(junior, "Думать", "том, как трудно обеспечить безопасность Карлсона"),
            new Action<Eatable>(carlson, "Есть", new Cookie("булочки", 123)),
            new Action<Eatable>(carlson, "Пить", new Juice("сок", 123)),
            new Action<Item>(carlson, "Держать", carlson.inventory.get("кружка прежде принадлежвашая малышу")),
            new Action<Item>(carlson, "Играть", carlson.inventory.get("кружка прежде принадлежвашая малышу")),
            new Action<String>(carlson, "Снять одежду", "Башмоки"),
            new Action<Void>(fille, new Executable<Void, Void>() {
                @Override
                public Void execute(Void arg) throws PlotHoleException {
                    System.out.println("пальцы Карлсона торчали.");
                    return null;
                }
            }, null)
    ));

    void run() {

        for (var action : story) {
            Executor.execute(action);
        }
        if (!Executor.isHistoryBroken())
            System.out.println("\n\n\nИстория не содержит логических ошибок");
        else
            System.out.println("\n\n\nИстория содержит логические ошибки");

    }

    static class Executor {
        private static String now_task;
        private static boolean historyBroken = false;

        public static void execute(Action action) {
            now_task = action.getSkillName();
            class PrettyPrint {
                private final String start;

                public PrettyPrint(String start) {
                    this.start = start;
                }

                void print() {
                    System.out.print(start);
                }
            }
            now_task = action.getSkillName();
            PrettyPrint sampleAction = new PrettyPrint("> ");
            PrettyPrint errorAction = new PrettyPrint("!!! ");
            PrettyPrint suggestionAction = new PrettyPrint("??? ");

            try {
                sampleAction.print();
                action.execute(null);
            } catch (PlotHoleException e) {
                errorAction.print();
                System.out.println(e.getMessage());
                suggestionAction.print();
                System.out.println(new Formatter().format("Are sure that you need '%s' at this action?",
                        e.getOwner()));
                historyBroken = true;
            }
        }

        public static boolean isHistoryBroken() {
            return historyBroken;
        }
    }
}
