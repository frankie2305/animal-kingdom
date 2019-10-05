package app;

import java.awt.*;

public class Lion extends Animal {

    public Lion(Habitat location) {
        this.location = location;
        this.color = Color.RED;
        Polygon mane = new Polygon();
        mane.addPoint(location.x + 6, location.y + 6);
        mane.addPoint(location.x + 29, location.y + 6);
        mane.addPoint(location.x + 29, location.y + 29);
        mane.addPoint(location.x + 6, location.y + 29);
        Polygon face = new Polygon();
        face.addPoint(location.x + 11, location.y + 11);
        face.addPoint(location.x + 24, location.y + 11);
        face.addPoint(location.x + 24, location.y + 24);
        face.addPoint(location.x + 11, location.y + 24);
        this.polygons.add(mane);
        this.polygons.add(face);
    }

}