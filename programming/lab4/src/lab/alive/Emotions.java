package lab.alive;

public enum Emotions {
    SAD("грустный"),
    Normal("спокойный"),
    Happy("счастливый");
    private final String state;

    Emotions(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return getState();
    }
}