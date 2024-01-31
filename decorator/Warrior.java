package decorator;

public class Warrior extends Player {
    public Warrior(String name) {
        super(FileReader.getLines("/Users/brendanmcnichols/Desktop/CSCE247/design_patterns/decorator/warrior.txt"), name);
    }
}