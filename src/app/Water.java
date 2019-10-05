package app;

import java.awt.*;

public class Water extends Habitat {

    public Water(int x, int y) {
        super(x, y);
        this.color = Color.BLUE;
        this.animal = "Fish";
        this.type = "Water";
        this.movementCost = 100;
    }
    
}