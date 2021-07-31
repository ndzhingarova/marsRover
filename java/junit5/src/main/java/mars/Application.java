package mars;

import mars.model.Rover;

public class Application {
    public static void main(String []args) {
        Rover rover = new Rover(10,10,"e");
        System.out.println(rover);

        rover.move("B");

        System.out.println(rover);
    }
}
