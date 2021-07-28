package mars.direction;

public interface RoverDirection {

    void moveForward(Rover rover);

    void moveBackward(Rover rover);

    void turnRight(Rover rover);

    void turnLeft(Rover rover);
}
