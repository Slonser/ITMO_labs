package lab;

public enum Locations {
    Home("дом"),
    Porch("крыльцо"),
    UNKNOWN("Неизвестна"),
    Neighbour("Неподалеку"),
    Street("улица");
    private final String location;

    Locations(String state) {
        this.location = state;
    }

    public String getState() {
        return this.location;
    }

    @Override
    public String toString() {
        return getState();
    }

}
