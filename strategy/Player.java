package strategy;
public abstract class Player {
    protected String firstName;
    protected String lastName;
    protected OffenceBehavior offenceBehavior;
    protected DefenceBehavior defenceBehavior;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract String play(boolean hasPossession);

    public OffenceBehavior getOffenceBehavior() {
        return offenceBehavior;
    }

    public DefenceBehavior getDefenceBehavior() {
        return defenceBehavior;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
