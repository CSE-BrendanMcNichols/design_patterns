package state;

public class SecondGradeState extends State {

    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("C:\\Users\\brend\\Desktop\\design_patterns-1\\state\\second.txt"); // Assume FileReader is implemented correctly
    }

    public String getNextWord() {
        if(words.isEmpty()) {
            return "No more words.";
        }
        return words.remove(rand.nextInt(words.size()));
    }

    public void increaseGrade() {
        spellingList.setState(spellingList.getThirdGradeState());
    }

    public void decreaseGrade() {
        spellingList.setState(spellingList.getFirstGradeState());
    }
}
