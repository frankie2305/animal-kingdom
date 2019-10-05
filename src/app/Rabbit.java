package app;

import java.awt.*;

public class Rabbit extends Animal {

    public Rabbit(Habitat location) {
        this.location = location;
        this.color = Color.WHITE;
        Polygon ear1 = new Polygon();
        ear1.addPoint(location.x + 11, location.y + 5);
        ear1.addPoint(location.x + 11, location.y + 12);
        ear1.addPoint(location.x + 16, location.y + 12);
        ear1.addPoint(location.x + 16, location.y + 5);
        Polygon ear2 = new Polygon();
        ear1.addPoint(location.x + 19, location.y + 5);
        ear1.addPoint(location.x + 19, location.y + 12);
        ear1.addPoint(location.x + 24, location.y + 12);
        ear1.addPoint(location.x + 24, location.y + 5);
        Polygon face = new Polygon();
        face.addPoint(location.x + 8, location.y + 12);
        face.addPoint(location.x + 27, location.y + 12);
        face.addPoint(location.x + 27, location.y + 25);
        face.addPoint(location.x + 8, location.y + 25);
        this.polygons.add(ear1);
        this.polygons.add(ear2);
        this.polygons.add(face);
    }

}