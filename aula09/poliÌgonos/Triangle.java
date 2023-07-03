package polígonos;

public class Triangle implements Polygon {
    private static int count = 0;

    Triangle() {
        count += 1;
    }

    @Override
    public Polygon clone() {
        return new Triangle();
    }

    @Override
    public String getType() {
        return "Triangle " + count;
    }

}
