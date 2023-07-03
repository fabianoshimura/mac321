package polígonos;

public class Octagon implements Polygon {

    @Override
    public String getType() {
        return "Octagon";
    }

    @Override
    public Polygon clone() {
        return new Octagon();
    }    

}
