package mars;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @ParameterizedTest
//    @CsvSource(value = {"0,0,NORTH", "10,145,EAST", "3256,10246,SOUTH", "124,145,WEST"})
    @CsvFileSource(resources = "/startingPosition.csv", numLinesToSkip = 1)
    void testStartingPoint(int positionX, int positionY, String direction) {
        Rover rover = new Rover(positionX, positionY, direction);

        assertEquals(positionX, rover.getPositionX());
        assertEquals(positionY, rover.getPositionY());
        assertEquals(Direction.fromString(direction), rover.getDirection());
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
        assertEquals(Direction.fromString(expectedDirection), rover.getDirection());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/moveFWD.csv", numLinesToSkip = 1)
    void moveForwardCommand(
            int positionX,
            int positionY,
            String direction,
            int expectedPositionX,
            int expectedPositionY,
            String expectedDirection) {
        Rover rover = new Rover(positionX,positionY, direction);
        RoverCommand moveForward = new MoveForwardCommand(rover);

        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.executeCommand(moveForward);

        assertEquals(expectedPositionX, rover.getPositionX());
        assertEquals(expectedPositionY, rover.getPositionY());
        assertEquals(Direction.fromString(expectedDirection), rover.getDirection());
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
        RoverCommand moveBackward = new MoveBackwardComand(rover);

        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.executeCommand(moveBackward);

        assertEquals(expectedPositionX, rover.getPositionX());
        assertEquals(expectedPositionY, rover.getPositionY());
        assertEquals(Direction.fromString(expectedDirection), rover.getDirection());
    }
}