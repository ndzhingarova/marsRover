package mars;

import mars.direction.Rover;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/startingPosition.csv", numLinesToSkip = 1)
    void testStartingPoint(int positionX, int positionY, String direction) {
        Rover rover = new Rover(positionX, positionY, direction);

//        assertEquals(new Coordinates(positionX, positionY), rover.getCoordinates());
//        assertEquals(Direction.fromString(direction), rover.getRoverDirection());

        Rover expected = new Rover(positionX, positionY, direction);
        assertEquals(expected, rover);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/goFWD.csv", numLinesToSkip = 1)
    void goForward(
            int positionX,
            int positionY,
            String direction,
            int expectedPositionX,
            int expectedPositionY,
            String expectedDirection) {
        Rover rover = new Rover(positionX,positionY, direction);
        rover.goForward();

        Rover expected = new Rover(expectedPositionX, expectedPositionY, expectedDirection);
        assertEquals(expected, rover);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/goBWD.csv", numLinesToSkip = 1)
    void goBackward(
            int positionX,
            int positionY,
            String direction,
            int expectedPositionX,
            int expectedPositionY,
            String expectedDirection) {
        Rover rover = new Rover(positionX,positionY, direction);
        rover.goBackward();

        Rover expected = new Rover(expectedPositionX, expectedPositionY, expectedDirection);
        assertEquals(expected, rover);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/turnRight.csv", numLinesToSkip = 1)
    void turnRight(
            int positionX,
            int positionY,
            String direction,
            String expectedDirection) {

        Rover rover = new Rover(positionX,positionY, direction);
        rover.turnRight();

        Rover expected = new Rover(positionX, positionY, expectedDirection);
        assertEquals(expected, rover);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/turnLeft.csv", numLinesToSkip = 1)
    void turnLeft(
            int positionX,
            int positionY,
            String direction,
            String expectedDirection) {

        Rover rover = new Rover(positionX,positionY, direction);
        rover.turnLeft();

        Rover expected = new Rover(positionX, positionY, expectedDirection);
        assertEquals(expected, rover);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/move.csv", numLinesToSkip = 1)
    void move(
            int positionX,
            int positionY,
            String direction,
            String command,
            int expectedPositionX,
            int expectedPositionY,
            String expectedDirection) {

        Rover rover = new Rover(positionX,positionY, direction);
        rover.move(command);

        Rover expected = new Rover(expectedPositionX, expectedPositionY, expectedDirection);
        assertEquals(expected, rover);
    }

    @Test
    void invalidMoveCommandThrows() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rover(10,10, "N")
                .move("A"));

    }
}