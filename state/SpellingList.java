package state;
/**
 * @author Brendan McNichols
 * Manages the spelling list and transitions between different grades
 */
public class SpellingList {
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;
/**
* Initializes the spelling list and sets it to the first grade state
*/
    public SpellingList() {
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
        
        state = firstGradeState;
    }
/**
* @return The next word to spell
*/
    public String getNextWord() {
        return state.getNextWord();
    }
 /**
* Increases the grade of the spelling list
*/
    public void increaseGrade() {
        state.increaseGrade();
    }
/**
* Decreases the grade of the spelling list
*/
    public void decreaseGrade() {
        state.decreaseGrade();
    }
/**
* @return The first grade state
*/
    public State getFirstGradeState() {
        return firstGradeState;
    }
/**
* @return The second grade state
*/
    public State getSecondGradeState() {
        return secondGradeState;
    }
/**
* @return The third grade state
*/
    public State getThirdGradeState() {
        return thirdGradeState;
    }
/**
* @param state state to set
*/
    public void setState(State state) {
        this.state = state;
    }
}
