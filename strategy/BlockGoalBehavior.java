
public class BlockGoalBehavior implements DefenceBehavior {
    public string Play() {
        Random random = new Random(); 
        int RandomNumber = new random.next(4);

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
