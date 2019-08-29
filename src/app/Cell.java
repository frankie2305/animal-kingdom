package app;

import java.awt.*;

abstract class Cell extends Rectangle {

    static int size = 35;
    Color color;
    String animal;
    String habitat;
    int movementCost;

    public Cell(int x, int y) {
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
            g.drawString("Habitat: " + habitat, 742, 360);
            g.drawString("Movement cost: " + movementCost, 742, 485);
        }
    }

}