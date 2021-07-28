package mars.direction;

import java.util.Objects;

public class South implements RoverDirection{
    @Override
    public Coordinates goForward(Coordinates coordinates) {
        return coordinates.moveSouth();
    }

    @Override
    public Coordinates goBackward(Coordinates coordinates) {
        return coordinates.moveNorth();
    }

    @Override
    public RoverDirection turnRight() {
        return new West();
    }

    @Override
    public RoverDirection turnLeft() {
        return new East();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof South;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(toString());
    }
}
