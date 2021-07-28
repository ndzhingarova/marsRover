package mars.direction;

public class West implements RoverDirection {
    @Override
    public void goForward(Rover rover) {
        rover.moveWest();
    }

    @Override
    public void goBackward(Rover rover) {
        rover.moveEast();
    }

    @Override
    public void turnRight(Rover rover) {
        rover.turnNorth();
    }

    @Override
    public void turnLeft(Rover rover) {
        rover.turnSouth();
    }

    @Override
    public String toString() {
        return "West";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof West;
    }
}
