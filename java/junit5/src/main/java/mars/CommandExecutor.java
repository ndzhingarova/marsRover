package mars;

public class CommandExecutor {
//    private RoverCommand roverCommand;
//
//    public void setCommand(RoverCommand roverCommand){
//        this.roverCommand = roverCommand;
//    }

    public void executeCommand(RoverCommand roverCommand) {
        roverCommand.execute();
    }
}
