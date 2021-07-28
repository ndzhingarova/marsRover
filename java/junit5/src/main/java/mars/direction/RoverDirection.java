package mars.direction;

import mars.Rover;

public interface RoverDirection {

    void moveForward(Rover rover);

    void moveBackward(Rover rover);

    void turnRight(Rover rover);

    void turnLeft(Rover rover);
}
