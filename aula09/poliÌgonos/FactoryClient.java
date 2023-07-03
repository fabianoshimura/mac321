package polígonos;

public class FactoryClient {
    public static void main(String[] args) {
        Polygon p;
        //PolygonFactory factory = new PolygonFactory();
        PolygonFactoryWithPrototype factory = new PolygonFactoryWithPrototype();
        
        //get the shape which has 4 sides
        p = factory.newPolygon(3);
        System.out.println("The shape with 3 sides is a " + p.getType());

        //get the shape which has 3 sides
        p = factory.newPolygon(3);
        System.out.println("The shape with 3 sides is a " + p.getType());


        //get the shape which has 4 sides
        p = factory.newPolygon(4);
        System.out.println("The shape with 4 sides is a " + p.getType());
        
        //get the shape which has 5 sides
        p = factory.newPolygon(5);
        System.out.println("The shape with 5 sides is a " + p.getType());

        //get the shape which has 8 sides
        p = factory.newPolygon(8);
        System.out.println("The shape with 8 sides is a " + p.getType());
    }
}
