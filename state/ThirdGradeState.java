package state;

public class ThirdGradeState extends State {

    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("C:\\Users\\brend\\Desktop\\design_patterns-1\\state\\third.txt");
    }

    public void increaseGrade() {
        // No action needed as this is the highest grade
        System.out.println("Already in the third grade.");
    }

    public void decreaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }
}
