package mars;

import mars.direction.*;

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

    public void moveForward() {
        this.roverDirection.moveForward(this);
    }

    public void moveBackward() {
        this.roverDirection.moveBackward(this);
    }

    @Override
    public String toString() {
        return "Rover{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", roverDirection=" + roverDirection +
                '}';
    }

    public void moveEast() {
        this.positionX++;
    }

    public void moveWest() {
        this.positionX--;
    }

    public void moveNorth() {
        this.positionY++;
    }

    public void moveSouth() {
        this.positionY--;
    }

    public void turnRight() {
        this.roverDirection.turnRight(this);
    }

    public void turnEast() {
        this.roverDirection = new East();
    }

    public void turnWest() {
        this.roverDirection = new West();
    }

    public void turnNorth() {
        this.roverDirection = new North();
    }

    public void turnSouth() {
        this.roverDirection = new South();
    }

    public void turnLeft() {
        this.roverDirection.turnLeft(this);
    }
}
