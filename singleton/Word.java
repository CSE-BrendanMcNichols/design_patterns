/**
* @author Brendan McNichols
* Represents a word with its type, definition, and example sentence.
 */

public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

/**
* Constructs a new Word with the specified text, type, definition, and example sentence.
* @param word       The text of the word.
* @param type       The type of the word (e.g., noun, verb, adjective).
* @param definition The definition of the word.
* @param sentence   An example sentence using the word.
*/

    public Word(String word, String type, String definition, String sentence) {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }
/**
* @return The text of the word
*/
    public String getWord() {
        return word;
    }
/**
 * @return A string containing the word's type, definition, and example sentence.
 */
    public String getDescription() {
        return "Type: " + type + "\nDefinition: " + definition + "\nSentence: " + sentence;
    }
}