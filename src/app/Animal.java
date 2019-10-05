package app;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public abstract class Animal {
    
    Habitat location;
    Color color;
    List<Polygon> polygons = new ArrayList<Polygon>();

    public void paint(Graphics g) {
        for (Polygon polygon: polygons) {
            g.setColor(color);
            g.fillPolygon(polygon);
            g.setColor(Color.BLACK);
            g.drawPolygon(polygon);
        }
    }

}