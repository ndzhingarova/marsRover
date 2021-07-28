package mars.direction;

import java.util.Objects;

public class North implements RoverDirection{
    @Override
    public Coordinates goForward(Coordinates coordinates) {
        return coordinates.moveNorth();
    }

    @Override
    public Coordinates goBackward(Coordinates coordinates) {
        return coordinates.moveSouth();
    }

    @Override
    public RoverDirection turnRight() {
        return new East();
    }

    @Override
    public RoverDirection turnLeft() {
        return new West();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof North;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(toString());
    }
}
