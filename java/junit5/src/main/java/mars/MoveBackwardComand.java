package mars;

public class MoveBackwardComand implements RoverCommand{
    Rover rover;

    public MoveBackwardComand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.moveBackward();
    }
}
