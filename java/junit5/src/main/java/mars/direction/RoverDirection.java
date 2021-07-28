package mars.direction;

public interface RoverDirection {

    void goForward(Rover rover);

    void goBackward(Rover rover);

    RoverDirection turnRight();

    RoverDirection turnLeft();
}
