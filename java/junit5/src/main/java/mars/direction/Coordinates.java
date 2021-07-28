package mars.direction;

public class Coordinates {
    private Integer positionX;
    private Integer positionY;

    public Coordinates(Integer positionX, Integer positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
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
