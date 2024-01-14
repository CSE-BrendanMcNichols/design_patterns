package strategy;
public class Goalie extends Player {

    public Goalie(String firstName, String lastName) {
        super(firstName, lastName);
        offenceBehavior = new BlockGoalBehavior();
        defenceBehavior = new BlockGoalBehavior();
    }

    public String play(boolean hasPossession) {
        return offenceBehavior.play();
    }

    public String toString() {
        return super.toString() + "plays the position: Goalie";
    }
}
