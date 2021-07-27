package mars.direction;

import mars.Rover;

public class North implements RoverDirection{
    @Override
    public void moveForward(Rover rover) {
        rover.moveNorth();
    }

    @Override
    public void moveBackward(Rover rover) {
        rover.moveSouth();
    }

    @Override
    public String toString() {
        return "North";
    }
}
