package mars.direction;

import mars.Rover;

public class West implements RoverDirection {
    @Override
    public void moveForward(Rover rover) {
        rover.moveWest();
    }

    @Override
    public void moveBackward(Rover rover) {
        rover.moveEast();
    }

    @Override
    public String toString() {
        return "West";
    }
}
