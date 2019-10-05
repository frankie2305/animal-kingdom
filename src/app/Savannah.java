package app;

import java.awt.*;

public class Savannah extends Habitat {

    public Savannah(int x, int y) {
        super(x, y);
        this.color = Color.ORANGE;
        this.animal = "Lion";
        this.type = "Savannah";
        this.movementCost = 10;
    }
    
}