package state;

import java.util.ArrayList;
import java.util.Random;

public abstract class State {
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    private Random rand = new Random();

    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
    }

    public String getNextWord() {
        if(words.isEmpty()) {
            return "No more words.";
        }
        int index = rand.nextInt(words.size());
        return words.remove(index);
    }
    
    public abstract void increaseGrade();
    public abstract void decreaseGrade();
}