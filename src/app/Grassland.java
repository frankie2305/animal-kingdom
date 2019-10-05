package app;

import java.awt.*;
import java.util.Random;

public class Grassland extends Habitat {

    private static final int MAX_RED_COMPONENT = 30;
    private static final int MIN_GREEN_COMPONENT = 100;
    private static final int MAX_BLUE_COMPONENT = 30;

    private static Random rand = new Random();
    public Grassland(int x, int y) {
        super(x, y);
        this.color = new Color(rand.nextInt(MAX_RED_COMPONENT), MIN_GREEN_COMPONENT + rand.nextInt(255 - MIN_GREEN_COMPONENT), 
                                rand.nextInt(MAX_BLUE_COMPONENT));
        this.animal = "Rabbit";
        this.type = "Grassland";
        this.movementCost = (this.color.getGreen() - 100)/50;
    }
    
}