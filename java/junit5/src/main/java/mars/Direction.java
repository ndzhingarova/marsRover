package mars;

import java.util.Locale;

public enum Direction {
    NORTH("N"),
    EAST("E"),
    SOUTH("S"),
    WEST("W");

    private String value;

    Direction(String w) {
        this.value = w;
    }

    public String getValue() {
        return value;
    }

    public static Direction fromString(String text) {
        for (Direction direction: Direction.values()) {
            if (direction.value.equalsIgnoreCase(text)){
                return direction;
            }

        }
        return Direction.valueOf(text.toUpperCase(Locale.ROOT));
//        throw new IllegalArgumentException("Invalid value for mars.Direction: " + text);
    }
}
