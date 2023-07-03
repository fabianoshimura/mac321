package polígonos;

public class Pentagon implements Polygon {

    @Override
    public String getType() {
        return "Pentagon";
    }

    @Override
    public Polygon clone() {
        return new Pentagon();
    }
}
