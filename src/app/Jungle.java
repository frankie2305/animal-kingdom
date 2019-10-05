package app;

import java.awt.*;
import java.util.Random;

public class Jungle {

    Habitat[][] habitats = new Habitat[20][20];
    Animal[][] animals = new Animal[20][20];
    HabitatFactory hf = HabitatFactory.getHabitatFactory();
    AnimalFactory af = AnimalFactory.getAnimalFactory();
    private static Random rand = new Random();
    private static final int GRASS_LIKELIHOOD = 3;

    public Jungle() {
        for (int i = 0; i < habitats.length; i++) {
            for (int j = 0; j < habitats[i].length; j++) {
                switch (rand.nextInt(GRASS_LIKELIHOOD + 3)) {
                    case 0:
                        habitats[i][j] = hf.createHabitat("desert", 10 + 35 * i, 10 + 35 * j);
                        animals[i][j] = af.createAnimal("jackal", habitats[i][j]);
                        break;
                    case 1:
                        habitats[i][j] = hf.createHabitat("savannah", 10 + 35 * i, 10 + 35 * j);
                        animals[i][j] = af.createAnimal("lion", habitats[i][j]);
                        break;
                    case 2:
                        habitats[i][j] = hf.createHabitat("water", 10 + 35 * i, 10 + 35 * j);
                        animals[i][j] = af.createAnimal("fish", habitats[i][j]);
                        break;
                    default:
                        habitats[i][j] = hf.createHabitat("grassland", 10 + 35 * i, 10 + 35 * j);
                        animals[i][j] = af.createAnimal("rabbit", habitats[i][j]);
                        break;
                }
            }
        }
    }

    public void paint(Graphics g, Point mousePos) {
        for (int i = 0; i < habitats.length; i++) {
            for (int j = 0; j < habitats[i].length; j++) {
                habitats[i][j].paint(g, mousePos);
                animals[i][j].paint(g);
            }
        }
    }
    
}