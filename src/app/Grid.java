package app;

import java.awt.*;
import java.util.Random;

class Grid {

    Cell[][] cells = new Cell[20][20];
    Animal[][] animals = new Animal[20][20];

    public Grid() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Random rand = new Random();
                int choice = rand.nextInt(6);
                if (choice <= 2) {
                    cells[i][j] = new Grass(10 + 35 * i, 10 + 35 * j);
                    animals[i][j] = new Rabbit(cells[i][j]);
                } else if (choice == 3) {
                    cells[i][j] = new Road(10 + 35 * i, 10 + 35 * j);
                    animals[i][j] = new Puppy(cells[i][j]);
                } else if (choice == 4) {
                    cells[i][j] = new Mountain(10 + 35 * i, 10 + 35 * j);
                    animals[i][j] = new Lion(cells[i][j]);
                } else {
                    cells[i][j] = new Water(10 + 35 * i, 10 + 35 * j);
                    animals[i][j] = new Fish(cells[i][j]);
                }
            }
        }
    }

    public void paint(Graphics g, Point mousePos) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j].paint(g, mousePos);
                animals[i][j].paint(g);
            }
        }
    }
    
}