package app;

import java.awt.*;

class Road extends Cell {

    public Road(int x, int y) {
        super(x, y);
        this.color = new Color(102, 102, 102);
        this.animal = "Puppy";
        this.habitat = "Road";
        this.movementCost = 1;
    }
    
}