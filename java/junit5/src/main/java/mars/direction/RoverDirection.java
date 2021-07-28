package mars.direction;

public interface RoverDirection {

    void goForward(Rover rover);

    void goBackward(Rover rover);

    void turnRight(Rover rover);

    void turnLeft(Rover rover);
}
