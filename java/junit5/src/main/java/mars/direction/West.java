package mars.direction;

public class West implements RoverDirection {
    @Override
    public void goForward(Rover rover) {
        rover.moveWest();
    }

    @Override
    public void goBackward(Rover rover) {
        rover.moveEast();
    }

    @Override
    public RoverDirection turnRight() {
        return new North();
    }

    @Override
    public RoverDirection turnLeft() {
        return new South();
    }

    @Override
    public String toString() {
        return "West";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof West;
    }
}
