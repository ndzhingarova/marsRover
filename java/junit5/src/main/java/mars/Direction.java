package mars;

import java.util.Locale;

public enum Direction {
    NORTH("N") {
        @Override
        public StepInstruction moveFWD() {
            System.out.println("increase y");
            return new StepInstruction(true, 1);
        }
    },
    EAST("E") {
        @Override
        public StepInstruction moveFWD() {
            System.out.println("increase x");
            return new StepInstruction(true, 1);
        }
    },
    SOUTH("S") {
        @Override
        public StepInstruction moveFWD() {
            System.out.println("decrease y");
            return new StepInstruction(false, 1);
        }

    },
    WEST("W") {
        @Override
        public StepInstruction moveFWD() {
            System.out.println("decrease x");
            return new StepInstruction(false, 1);
        }
    };

    private String value;

    Direction(String w) {
        this.value = w;
    }

    public String getValue() {
        return value;
    }

    public static Direction fromString(String text) {
        for (Direction direction: Direction.values()) {
            if (direction.value.equalsIgnoreCase(text)){
                return direction;
            }

        }
        return Direction.valueOf(text.toUpperCase(Locale.ROOT));
//        throw new IllegalArgumentException("Invalid value for mars.Direction: " + text);
    }

    public abstract StepInstruction moveFWD();
}
