package state;
/**
 * @author Brendan McNichols
 * Class for managing second grade level words and state transitions for the spelling list
 */
public class SecondGradeState extends State {
/**
* Initializes second grade words from the text file located in the specified file path
*@param spellingList words associated with this state
*/
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("C:\\Users\\brend\\Desktop\\design_patterns-1\\state\\second.txt");
    }
/**
* Increases grade level
*/
    public void increaseGrade() {
        spellingList.setState(spellingList.getThirdGradeState());
    }
/**
 * Decrease grade level
 */
    public void decreaseGrade() {
        spellingList.setState(spellingList.getFirstGradeState());
    }
}