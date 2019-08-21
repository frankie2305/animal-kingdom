package app;

import java.awt.*;

class Water extends Cell {

    public Water(int x, int y) {
        super(x, y);
        this.color = new Color(0, 0, 255);
        this.animal = "Fish";
        this.habitat = "Water";
        this.movementCost = 100;
    }
    
}