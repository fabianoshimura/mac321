package polígonos;

public class Square implements Polygon {

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public Polygon clone() {
        return new Square();
    }    

}
