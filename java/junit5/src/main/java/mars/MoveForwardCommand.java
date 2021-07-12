package mars;

public class MoveForwardCommand implements RoverCommand{
    Rover rover;

    public MoveForwardCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.moveForward();
    }
}
