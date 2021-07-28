package mars.direction;

public class East implements RoverDirection {
    @Override
    public void moveForward(Rover rover) {
        rover.moveEast();
    }

    @Override
    public void moveBackward(Rover rover) {
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
