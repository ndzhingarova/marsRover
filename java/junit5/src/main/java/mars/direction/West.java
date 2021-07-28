package mars.direction;

public class West implements RoverDirection {
    @Override
    public Coordinates goForward(Coordinates coordinates) {
        return new Coordinates(coordinates.getPositionX()-1, coordinates.getPositionY());
    }

    @Override
    public Coordinates goBackward(Coordinates coordinates) {
        return new Coordinates(coordinates.getPositionX()+1, coordinates.getPositionY());
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
