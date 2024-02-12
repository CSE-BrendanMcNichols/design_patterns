/**
 * @author Brendan McNichols
 * Class that manages the flashcards
 */

import java.util.ArrayList;
import java.util.Random;

public class FlashCards {
    private Random rand = new Random();
    private ArrayList<Word> words;
    private static FlashCards flashCardsInstance;
    private Word currentWord;

    private FlashCards() {
        words = FileReader.getWords();
        if (words.isEmpty()) {
            System.out.println("No words available.");
            System.exit(1);
        }
    }

 /**
* Public method to get the singleton instance of the FlashCards class.
* @return The single instance of the FlashCards class.
*/

    public static FlashCards getInstance() {
        if (flashCardsInstance == null) {
            flashCardsInstance = new FlashCards();
        }
        return flashCardsInstance;
    }

/**
* Retrieves and returns a random word from the list.
* Once a word is returned, it is removed from the list to avoid repetition.
* @return The next random word for the flashcard.
*/
    public Word getWord() {
        if (words.isEmpty()) {
            currentWord = new Word("No more words", "", "", "");
            return currentWord;
        }
        int index = rand.nextInt(words.size());
        currentWord = words.remove(index);
        return currentWord;
    }
}
