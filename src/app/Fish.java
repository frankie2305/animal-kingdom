package app;

import java.awt.*;

public class Fish extends Animal {

    public Fish(Cell location) {
        this.location = location;
        this.color = Color.YELLOW;
        Polygon body = new Polygon();
        body.addPoint(location.x + 5, location.y + 17);
        body.addPoint(location.x + 15, location.y + 10);
        body.addPoint(location.x + 25, location.y + 17);
        body.addPoint(location.x + 15, location.y + 24);
        Polygon tail = new Polygon();
        tail.addPoint(location.x + 25, location.y + 17);
        tail.addPoint(location.x + 30, location.y + 12);
        tail.addPoint(location.x + 30, location.y + 22);
        this.polygons.add(body);
        this.polygons.add(tail);
    }

}