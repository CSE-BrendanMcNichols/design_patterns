package decorator;

import java.util.ArrayList;

public class Sword extends PlayerDecorator {
    public Sword(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("/Users/brendanmcnichols/Desktop/CSCE247/design_patterns/decorator/sword.txt"));
    }

protected void integrateDecor(ArrayList<String> decor) {
    int maxLength = 35; // Fixed line length for ASCII art

    for (int i = 0; i < decor.size(); i++) {
        // Pad the warrior's line to maxLength
        StringBuilder paddedPlayerLine = new StringBuilder(lines.get(i));
        while (paddedPlayerLine.length() < maxLength) {
            paddedPlayerLine.append(" ");
        }

        // Pad the decorator's line to maxLength
        String decorLine = decor.get(i);
        StringBuilder paddedDecorLine = new StringBuilder(decorLine);
        while (paddedDecorLine.length() < maxLength) {
            paddedDecorLine.append(" ");
        }

        // Overlay the decorator's ASCII art onto the warrior's
        for (int j = 0; j < maxLength; j++) {
            char decorChar = paddedDecorLine.charAt(j);
            if (decorChar != ' ') {
                paddedPlayerLine.setCharAt(j, decorChar);
            }
        }

        // Replace the existing line with the new line
        lines.set(i, paddedPlayerLine.toString());
    }
}
}