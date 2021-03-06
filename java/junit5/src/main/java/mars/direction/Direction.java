package mars.direction;

import mars.model.Coordinates;

public enum Direction {
    NORTH("N", new North()),
    EAST("E", new East()),
    SOUTH("S", new South()),
    WEST("W", new West());

    private String value;
    private RoverDirection roverDirection;

    Direction(String value, RoverDirection roverDirection) {
        this.value = value;
        this.roverDirection = roverDirection;
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
