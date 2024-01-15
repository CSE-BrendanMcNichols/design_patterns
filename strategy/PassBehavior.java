package strategy;
/**
 * @author Brendan McNichols
 * Represents an offence behavior of passing to a forward
 * Implements the OffenceBehavior interface
 */
public class PassBehavior implements OffenceBehavior {
    /**
     * Performs the pass behavior by passing the puck to a forward.
     * @return A string indicating the specific offensive action of passing.
     */
    public String play() {
        return "Passes to a forward";
    }
}