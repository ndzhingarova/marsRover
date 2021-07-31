package mars.model;

import java.util.Objects;

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

    private Integer getPositionX() {
        return positionX;
    }

    private Integer getPositionY() {
        return positionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return Objects.equals(positionX, that.positionX) && Objects.equals(positionY, that.positionY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionX, positionY);
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
