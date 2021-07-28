package mars.direction;

public class East implements RoverDirection {
    @Override
    public void goForward(Rover rover) {
        rover.moveEast();
    }

    @Override
    public void goBackward(Rover rover) {
        rover.moveWest();
    }

    @Override
    public void turnRight(Rover rover) {
        rover.turnSouth();
    }

    @Override
    public void turnLeft(Rover rover) {
        rover.turnNorth();
    }

    @Override
    public String toString() {
        return "East";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof East;
    }
}
