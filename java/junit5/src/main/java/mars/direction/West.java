package mars.direction;

import mars.model.Coordinates;

import java.util.Objects;

public class West implements RoverDirection {
    @Override
    public Coordinates goForward(Coordinates coordinates) {
        return coordinates.moveWest();
    }

    @Override
    public Coordinates goBackward(Coordinates coordinates) {
        return coordinates.moveEast();
    }

    @Override
    public RoverDirection turnRight() {
        return new North();
    }

    @Override
    public RoverDirection turnLeft() {
        return new South();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof West;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(toString());
    }
}
