package mars.direction;

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
        return "South";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof South;
    }
}
