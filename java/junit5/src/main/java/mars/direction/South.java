package mars.direction;

import mars.Rover;

public class South implements RoverDirection{
    @Override
    public void moveForward(Rover rover) {
        rover.moveSouth();
    }

    @Override
    public void moveBackward(Rover rover) {
        rover.moveNorth();
    }

    @Override
    public String toString() {
        return "South";
    }
}
