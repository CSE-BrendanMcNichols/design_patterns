package strategy;
import java.util.Random;
/**
 * @author Brendan McNichols
 * Performs the block goal behavior
 * @return a string representing which block goal behavior was chosen
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {
    public String play() {
        Random random = new Random();
        int randomNumber = random.nextInt(4);

        if (randomNumber == 0) {
            return "hand blocks the puck";
        } else if (randomNumber == 1) {
            return "catches the puck";
        } else if (randomNumber == 2) {
            return "blocks puck with knee pads";
        } else {
            return "blocks puck with stick";
        }
    }
}
