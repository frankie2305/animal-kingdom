package app;

import java.awt.*;

class Mountain extends Cell {

    public Mountain(int x, int y) {
        super(x, y);
        this.color = new Color(204, 204, 204);
        this.animal = "Lion";
        this.habitat = "Mountain";
        this.movementCost = 10;
    }
    
}