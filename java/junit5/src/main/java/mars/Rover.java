package mars;

public class Rover {

    private Integer positionX;
    private Integer positionY;
    private Direction direction;

    public Rover(Integer positionX, Integer positionY, String direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = Direction.fromString(direction);
    }

    public Integer getPositionX() {
        return this.positionX;
    }

    public Integer getPositionY() {
        return this.positionY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void moveForward2() {
        StepInstruction stepInstruction = this.direction.moveFWD();

    }

    public void moveForward() {
        switch (this.direction) {
            case NORTH:
                this.positionY++;
                break;
            case EAST:
                this.positionX++;
                break;
            case SOUTH:
                this.positionY--;
                break;
            case WEST:
                this.positionX--;
                break;
        }
    }

    public void moveBackward() {
        switch (this.direction) {
            case NORTH:
                this.positionY--;
                break;
            case EAST:
                this.positionX--;
                break;
            case SOUTH:
                this.positionY++;
                break;
            case WEST:
                this.positionX++;
                break;
        }
    }

    @Override
    public String toString() {
        return "Rover{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", direction=" + direction +
                '}';
    }
}
