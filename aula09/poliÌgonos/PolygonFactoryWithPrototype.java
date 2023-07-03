package polígonos;

import java.util.HashMap;

public class PolygonFactoryWithPrototype {
    private static HashMap<Integer, Polygon> polygons = new HashMap<>();

    public PolygonFactoryWithPrototype() {
        polygons.put(3, new Triangle());
        polygons.put(4, new Square());
        polygons.put(5, new Pentagon());
        polygons.put(7, new Heptagon());
        polygons.put(8, new Octagon());
    }

    public Polygon newPolygon(int numberOfSides) {
        return polygons.get(numberOfSides).clone();
    }
}
