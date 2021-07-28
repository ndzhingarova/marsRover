package mars.direction;

public class East implements RoverDirection {
    @Override
    public Coordinates goForward(Coordinates coordinates) {
        return new Coordinates(coordinates.getPositionX()+1, coordinates.getPositionY());
    }

    @Override
    public Coordinates goBackward(Coordinates coordinates) {
        return new Coordinates(coordinates.getPositionX()-1, coordinates.getPositionY());
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
