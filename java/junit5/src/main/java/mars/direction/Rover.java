package mars.direction;

public class Rover {

    private Integer positionX;
    private Integer positionY;
    private RoverDirection roverDirection;

    public Rover(Integer positionX, Integer positionY, String direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.roverDirection = Direction.fromString(direction);
    }

    public Integer getPositionX() {
        return this.positionX;
    }

    public Integer getPositionY() {
        return this.positionY;
    }

    public RoverDirection getRoverDirection() {
        return roverDirection;
    }

    public void goForward() {
        this.roverDirection.goForward(this);
    }

    public void goBackward() {
        this.roverDirection.goBackward(this);
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
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", roverDirection=" + roverDirection +
                '}';
    }

    void moveEast() {
        this.positionX++;
    }

    void moveWest() {
        this.positionX--;
    }

    void moveNorth() {
        this.positionY++;
    }

    void moveSouth() {
        this.positionY--;
    }

    void turnEast() {
        this.roverDirection = new East();
    }

    void turnWest() {
        this.roverDirection = new West();
    }

    void turnNorth() {
        this.roverDirection = new North();
    }

    void turnSouth() {
        this.roverDirection = new South();
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
