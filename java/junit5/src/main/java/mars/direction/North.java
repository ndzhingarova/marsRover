package mars.direction;

public class North implements RoverDirection{
    @Override
    public void goForward(Rover rover) {
        rover.moveNorth();
    }

    @Override
    public void goBackward(Rover rover) {
        rover.moveSouth();
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
        return "North";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof North;
    }
}
