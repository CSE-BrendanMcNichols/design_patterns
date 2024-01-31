package decorator;

import java.util.ArrayList;

public abstract class PlayerDecorator extends Player {
    protected Player player;

    public PlayerDecorator(Player player) {
        super(new ArrayList<>(player.lines), player.name); // Make a copy of the lines to avoid modifying the original player's lines directly
        this.player = player;
    }

    protected void integrateDecor(ArrayList<String> decor) {
        int maxLength = 35; // Maximum length of a line
    
        for (int i = 0; i < lines.size(); i++) {
            StringBuilder paddedPlayerLine = new StringBuilder(lines.get(i));
            paddedPlayerLine.setLength(maxLength); // Pad the player line to maxLength
            String decorLine = decor.get(i) + String.format("%" + (maxLength - decor.get(i).length()) + "s", "");
    
            for (int j = 0; j < decorLine.length(); j++) {
                if (decorLine.charAt(j) != ' ' && j < paddedPlayerLine.length()) {
                    paddedPlayerLine.setCharAt(j, decorLine.charAt(j));
                }
            }
    
            lines.set(i, paddedPlayerLine.toString());
        }
    }
}