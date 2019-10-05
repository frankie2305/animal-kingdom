package app;

import java.awt.*;

public class Desert extends Habitat {

    public Desert(int x, int y)  {
        super(x, y);
        this.color = Color.YELLOW;
        this.animal = "Jackal";
        this.type = "Desert";
        this.movementCost = 1;
    }
    
}