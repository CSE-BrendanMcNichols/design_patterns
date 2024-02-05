package state;

public class FirstGradeState extends State {

    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("C:\\Users\\brend\\Desktop\\design_patterns-1\\state\\first.txt"); // Assume FileReader is implemented correctly
    }

    public String getNextWord() {
        if(words.isEmpty()) {
            return "No more words.";
        }
        return words.remove(rand.nextInt(words.size()));
    }

    public void increaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }

    public void decreaseGrade() {
        // No action needed as this is the lowest grade
        System.out.println("Already in the first grade.");
    }
}
