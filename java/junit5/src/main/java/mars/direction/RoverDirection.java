package mars.direction;

import mars.model.Coordinates;

public interface RoverDirection {

    Coordinates goForward(Coordinates coordinates);

    Coordinates goBackward(Coordinates coordinates);

    RoverDirection turnRight();

    RoverDirection turnLeft();
}
