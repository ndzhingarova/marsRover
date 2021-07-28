package mars.direction;

public class Coordinates {
    private Integer positionX;
    private Integer positionY;

    public Coordinates(Integer positionX, Integer positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Coordinates moveEast() {
        return new Coordinates(this.getPositionX()+1, this.getPositionY());
    }

    public Coordinates moveWest() {
        return new Coordinates(this.getPositionX()-1, this.getPositionY());
    }

    public Coordinates moveNorth() {
        return new Coordinates(this.getPositionX(), this.getPositionY()+1);
    }

    public Coordinates moveSouth() {
        return new Coordinates(this.getPositionX(), this.getPositionY()-1);
    }

    public Integer getPositionX() {
        return positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
