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
