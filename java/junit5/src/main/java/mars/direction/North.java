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
    public void turnRight(Rover rover) {
        rover.turnEast();
    }

    @Override
    public void turnLeft(Rover rover) {
        rover.turnWest();
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
