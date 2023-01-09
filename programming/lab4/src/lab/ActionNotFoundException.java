package lab;

import java.util.Formatter;

public class ActionNotFoundException extends RuntimeException {
    public ActionNotFoundException() {
    }

    public ActionNotFoundException(String message) {
        super(message);
    }

    public ActionNotFoundException(String owner, String skillName) {
        this(new Formatter().format("%s doesn't have skill '%s'", owner, skillName).toString());
    }
}
