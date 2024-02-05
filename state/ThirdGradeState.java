package state;

public class ThirdGradeState extends State {

    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("C:\\Users\\brend\\Desktop\\design_patterns-1\\state\\third.txt"); // Assume FileReader is implemented correctly
    }

    public String getNextWord() {
        if(words.isEmpty()) {
            return "No more words.";
        }
        return words.remove(rand.nextInt(words.size()));
    }

    public void increaseGrade() {
        // No action needed as this is the highest grade
        System.out.println("Already in the third grade.");
    }

    public void decreaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }
}
