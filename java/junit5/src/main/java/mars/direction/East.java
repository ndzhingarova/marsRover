package mars.direction;

public class East implements RoverDirection {
    @Override
    public void goForward(Rover rover) {
        rover.moveEast();
    }

    @Override
    public void goBackward(Rover rover) {
        rover.moveWest();
    }

    @Override
    public RoverDirection turnRight() {
        return new South();
    }

    @Override
    public RoverDirection turnLeft() {
        return new North();
    }

    @Override
    public String toString() {
        return "East";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof East;
    }
}
