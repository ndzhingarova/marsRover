package mars.direction;

import mars.Rover;

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
    public String toString() {
        return "East";
    }
}
