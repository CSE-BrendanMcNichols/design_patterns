package state;
/**
 * @author Brendan McNichols
 * Class for managing third grade level words and state transitions for the spelling list
 */
public class ThirdGradeState extends State {
/**
* Initializes third grade words from the text file located in the specified file path
*@param spellingList words associated with this state
*/
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("C:\\Users\\brend\\Desktop\\design_patterns-1\\state\\third.txt");
    }
/**
* Increases grade level but since we are at the highest grade allowed the user is notified. 
*/
    public void increaseGrade() {
        // No action needed as this is the highest grade
        System.out.println("Cannot go any higher");
    }
/**
 * Decrease grade level
 */
    public void decreaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }
}
