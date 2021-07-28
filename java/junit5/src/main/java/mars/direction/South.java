package mars.direction;

public class South implements RoverDirection{
    @Override
    public void goForward(Rover rover) {
        rover.moveSouth();
    }

    @Override
    public void goBackward(Rover rover) {
        rover.moveNorth();
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
