package strategy;
import java.util.Random;
/**
 * @author Brendan McNichols
 * Performs the block behavior
 * @return a string representing the defensive action generated.
 */
public class BlockBehavior implements DefenceBehavior {
    public String play() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (randomNumber == 0) {
            return "block player from passing";
        } else if (randomNumber == 1) {
            return "blocks player from shooting";
        } else {
            return "checks player with puck";
        }
    }
}