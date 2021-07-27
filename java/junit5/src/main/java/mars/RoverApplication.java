package mars;

public class RoverApplication {
    public static void main(String []args) {
        Rover rover = new Rover(10,10,"e");
        System.out.println(rover);

        RoverCommand moveForward = new MoveForwardCommand(rover);

        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.executeCommand(moveForward);

        System.out.println(rover);
    }
}
