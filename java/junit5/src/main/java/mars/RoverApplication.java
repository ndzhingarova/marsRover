package mars;

public class RoverApplication {
    public static void main(String []args) {
        Rover rover = new Rover(10,10,"e");
        System.out.println(rover);

        rover.moveForward();

        System.out.println(rover);
    }
}
