import java.util.ArrayList;
import java.util.Random;

public class FlashCards {
    private Random rand = new Random();
    private ArrayList<Word> words;
    private static FlashCards flashCardsInstance;

    // Private constructor for singleton
    private FlashCards() {
        words = FileReader.getWords();
        if (words.isEmpty()) {
            System.out.println("No words available.");
            System.exit(1); // Exit the program as no words are available
        }
    }

    // Public method to get the singleton instance
    public static FlashCards getInstance() {
        if (flashCardsInstance == null) {
            flashCardsInstance = new FlashCards();
        }
        return flashCardsInstance;
    }

    // Method to get a random word
    public Word getWord() {
        if (words.isEmpty()) {
            // This should not happen as we exit if the list is empty during initialization
            return new Word("No more words", "", "", ""); // Returning a dummy Word object to prevent null
        }
        int index = rand.nextInt(words.size());
        return words.remove(index); // Remove the word once it has been shown to avoid repetition
    }
}
