package homework.task9.player;

public class PlayerMark {

    private final String name;
    private final String symbol;

    protected PlayerMark(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
