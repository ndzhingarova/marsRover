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
    public void turnRight(Rover rover) {
        rover.turnWest();
    }

    @Override
    public void turnLeft(Rover rover) {
        rover.turnEast();
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
