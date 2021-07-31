package mars.direction;

import mars.model.Coordinates;

import java.util.Objects;

public class East implements RoverDirection {
    @Override
    public Coordinates goForward(Coordinates coordinates) {
        return coordinates.moveEast();
    }

    @Override
    public Coordinates goBackward(Coordinates coordinates) {
        return coordinates.moveWest();
    }

    @Override
    public RoverDirection turnRight() {
        return new South();
    }

    @Override
    public RoverDirection turnLeft() {
        return new North();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof East;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(toString());
    }
}
