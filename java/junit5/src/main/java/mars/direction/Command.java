package mars.direction;

public enum Command {

    F {
        @Override
        public void execute(Rover rover) {
            rover.goForward();
        }
    },
    B{
        @Override
        public void execute(Rover rover) {
            rover.goBackward();
        }
    },
    R{
        @Override
        public void execute(Rover rover) {
            rover.turnRight();
        }
    },
    L{
        @Override
        public void execute(Rover rover) {
            rover.turnLeft();
        }
    };

    public abstract void execute(Rover rover);
}
