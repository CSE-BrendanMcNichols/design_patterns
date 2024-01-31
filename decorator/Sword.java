package decorator;

import java.util.ArrayList;

public class Sword extends PlayerDecorator {
    public Sword(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("/Users/brendanmcnichols/Desktop/CSCE247/design_patterns/decorator/sword.txt"));
    }

    protected void integrateDecor(ArrayList<String> decor) {
        int maxLength = 35; 

        for (int i = 0; i < lines.size(); i++) {
            StringBuilder lineBuilder = new StringBuilder(lines.get(i));
            while (lineBuilder.length() < maxLength) {
                lineBuilder.append(" ");
            }
            lines.set(i, lineBuilder.toString());
        }
    
        for (int i = 0; i < decor.size(); i++) {
            String decorLine = decor.get(i);
            StringBuilder lineBuilder = new StringBuilder(lines.get(i));
    
            for (int j = 0; j < decorLine.length(); j++) {
                if (j < lineBuilder.length() && decorLine.charAt(j) != ' ') {
                    lineBuilder.setCharAt(j, decorLine.charAt(j));
                }
            }
    
            lines.set(i, lineBuilder.toString());
        }
    }
}    