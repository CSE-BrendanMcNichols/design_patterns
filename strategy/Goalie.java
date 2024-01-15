package strategy;
/**
 * @author Brendan McNichols
 * Represents the position of goalie in a hockey game.
 */


public class Goalie extends Player {
/**
 * @param firstName The first name of the goalie.
 * @param lastName The last name of the goalie.
 */
    public Goalie(String firstName, String lastName) {
        super(firstName, lastName);
        offenceBehavior = new BlockGoalBehavior();
        defenceBehavior = new BlockGoalBehavior();
    }
/**
 *  @param hasPossession A boolean indicating whether the team has possession of the puck or not.
 *  @return A string representing the specific offensive action.
 */
    public String play(boolean hasPossession) {
        return offenceBehavior.play();
    }
/**
 *  @return A string indicating the first name, last name, and position of the goalie.
 */
    public String toString() {
        return super.toString() + " plays the position: Goalie";
    }
}
