package app;

import java.awt.*;

public abstract class Habitat extends Rectangle {

    static int size = 35;
    Color color;
    String animal;
    String type;
    int movementCost;

    public Habitat(int x, int y) {
        super(x, y, size, size);
    }

    void paint(Graphics g, Point mousePos) {
        g.setColor(color);
        g.fillRect(x, y, size, size);
        g.setColor(Color.BLACK);
        if (mousePos != null && super.contains(mousePos)) {
            Font f = new Font("Times New Roman", Font.BOLD, 24);
            g.setFont(f);
            g.drawString("Animal: " + animal, 742, 235);
            g.drawString("Habitat: " + type, 742, 360);
            g.drawString("Movement cost: " + movementCost, 742, 485);
        }
    }

}