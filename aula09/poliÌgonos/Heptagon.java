package polígonos;

public class Heptagon implements Polygon {

    @Override
    public String getType() {
        return "Heptagon";
    }

    @Override
    public Polygon clone() {
        return new Heptagon();
    }
}
