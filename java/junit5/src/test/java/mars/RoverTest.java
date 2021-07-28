package mars;

import mars.direction.Direction;
import mars.direction.Rover;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/startingPosition.csv", numLinesToSkip = 1)
    void testStartingPoint(int positionX, int positionY, String direction) {
        Rover rover = new Rover(positionX, positionY, direction);

        assertEquals(positionX, rover.getPositionX());
        assertEquals(positionY, rover.getPositionY());
        assertEquals(Direction.fromString(direction), rover.getRoverDirection());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/moveFWD.csv", numLinesToSkip = 1)
    void moveForward(
            int positionX,
            int positionY,
            String direction,
            int expectedPositionX,
            int expectedPositionY,
            String expectedDirection) {
        Rover rover = new Rover(positionX,positionY, direction);
        rover.moveForward();

        assertEquals(expectedPositionX, rover.getPositionX());
        assertEquals(expectedPositionY, rover.getPositionY());
        assertEquals(Direction.fromString(expectedDirection), rover.getRoverDirection());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/moveBWD.csv", numLinesToSkip = 1)
    void moveBackwardCommand(
            int positionX,
            int positionY,
            String direction,
            int expectedPositionX,
            int expectedPositionY,
            String expectedDirection) {
        Rover rover = new Rover(positionX,positionY, direction);
        rover.moveBackward();

        assertEquals(expectedPositionX, rover.getPositionX());
        assertEquals(expectedPositionY, rover.getPositionY());
        assertEquals(Direction.fromString(expectedDirection), rover.getRoverDirection());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/turnRight.csv", numLinesToSkip = 1)
    void turnRightCommand(
            int positionX,
            int positionY,
            String direction,
            String expectedDirection) {

        Rover rover = new Rover(positionX,positionY, direction);
        rover.turnRight();
        assertEquals(Direction.fromString(expectedDirection), rover.getRoverDirection());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/turnLeft.csv", numLinesToSkip = 1)
    void turnLeftCommand(
            int positionX,
            int positionY,
            String direction,
            String expectedDirection) {

        Rover rover = new Rover(positionX,positionY, direction);
        rover.turnLeft();
        assertEquals(Direction.fromString(expectedDirection), rover.getRoverDirection());
    }
}