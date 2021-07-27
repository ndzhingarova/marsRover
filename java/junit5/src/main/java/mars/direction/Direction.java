package mars.direction;

public enum Direction {
    NORTH("N", new North()),
    EAST("E", new East()),
    SOUTH("S", new South()),
    WEST("W", new West());

    private String value;
    private RoverDirection roverDirection;

    Direction(String w, RoverDirection roverDirection) {
        this.value = w;
        this.roverDirection = roverDirection;
    }

    public String getValue() {
        return value;
    }

    public static RoverDirection fromString(String text) {
        for (Direction direction: Direction.values()) {
            if (direction.name().equalsIgnoreCase(text)
                    || direction.value.equalsIgnoreCase(text)){
                return direction.roverDirection;
            }

        }
        throw new IllegalArgumentException("Invalid value for mars.direction.Direction: " + text);
    }

}
