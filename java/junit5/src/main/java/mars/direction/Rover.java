package mars.direction;

public class Rover {

    private Coordinates coordinates;
    private RoverDirection roverDirection;

    public Rover(Integer positionX, Integer positionY, String direction) {
        this.coordinates = new Coordinates(positionX, positionY);
        this.roverDirection = Direction.fromString(direction);
    }

    public Integer getPositionX() {
        return this.getCoordinates().getPositionX();
    }

    public Integer getPositionY() {
        return this.getCoordinates().getPositionY();
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public RoverDirection getRoverDirection() {
        return roverDirection;
    }

    public void goForward() {
        this.coordinates = this.roverDirection.goForward(this.coordinates);
    }

    public void goBackward() {
        this.coordinates = this.roverDirection.goBackward(this.coordinates);
    }

    public void turnRight() {
        this.roverDirection = this.roverDirection.turnRight();
    }

    public void turnLeft() {
        this.roverDirection = this.roverDirection.turnLeft();
    }

    @Override
    public String toString() {
        return "Rover{" +
                "coordinates=" + coordinates +
                ", roverDirection=" + roverDirection +
                '}';
    }

    void moveEast() {
        this.coordinates = new Coordinates(this.getCoordinates().getPositionX()+1, this.getCoordinates().getPositionY());
    }

    void moveWest() {
        this.coordinates = new Coordinates(this.getCoordinates().getPositionX()-1, this.getCoordinates().getPositionY());
    }

    void moveNorth() {
        this.coordinates = new Coordinates(this.getCoordinates().getPositionX(), this.getCoordinates().getPositionY()+1);
    }

    void moveSouth() {
        this.coordinates = new Coordinates(this.getCoordinates().getPositionX(), this.getCoordinates().getPositionY()-1);
    }

    public void move(String command) {
        switch (command) {
            case "F":
                this.goForward();
                break;
            case "B":
                this.goBackward();
                break;
            case "R":
                this.turnRight();
                break;
            case "L":
                this.turnLeft();
                break;
            default:
        }
    }
}
