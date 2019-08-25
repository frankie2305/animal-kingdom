package app;

import java.awt.*;
import java.util.Random;

class Grass extends Cell {

    public Grass(int x, int y) {
        super(x, y);
        Random rand = new Random();
        int r = rand.nextInt(28);
        int g = rand.nextInt(156) + 100;
        int b = rand.nextInt(28);
        this.color = new Color(r, g, b);
        this.animal = "Rabbit";
        this.habitat = "Grass";
        this.movementCost = (g - 100)/50;
    }
    
}