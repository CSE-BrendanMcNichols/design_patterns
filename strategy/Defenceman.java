package strategy;
import java.util.Random;
public class Defenceman extends Player {
    public Defenceman (String firstName, String lastName) {
        super(firstName, lastName);
        updateBehaviors();
    }
    
    private void updateBehaviors() {
        if (new Random().nextInt(10) < 9) {
            offenceBehavior = new PassBehavior();
        } else {
            offenceBehavior = new SlapShotBehavior();
        }

        if (new Random().nextBoolean()) {
            defenceBehavior = new ChasePuckBehavior();
        } else {
            defenceBehavior = new BlockBehavior();
        }
    }
    public String play (boolean hasPossession) {
        updateBehaviors();
        return offenceBehavior.play();
    }
}