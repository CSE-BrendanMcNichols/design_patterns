package state;
/**
 * @author Brendan McNichols
 * Class for managing first grade level words and state transitions for the spelling list
 */
public class FirstGradeState extends State {
/**
* Initializes first-grade words from the text file located in the specified file path
*@param spellingList words associated with this state
*/
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("C:\\Users\\brend\\Desktop\\design_patterns-1\\state\\first.txt");
    }
/**
* Increases grade level
*/
    public void increaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }
/**
 * Decreases the grade level but since we are at the lowest grade allowed the user is notified.
 */
    public void decreaseGrade() {
        // No action needed as this is the lowest grade
        System.out.println("Cannot go any lower");
    }
}