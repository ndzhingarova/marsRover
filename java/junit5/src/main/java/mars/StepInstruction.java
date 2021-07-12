package mars;

public class StepInstruction {
    boolean advance;
    int steps;

    public StepInstruction(boolean advance, int steps) {
        this.advance = advance;
        this.steps = steps;
    }

    @Override
    public String toString() {
        return "StepInstruction{" +
                "advance=" + advance +
                ", steps=" + steps +
                '}';
    }
}
