
public class Coord {
	private double x;
	private double y;

	Coord(double x, double y) {
		this.x = x;
		this.y = y;
	}
	// setters
	//public void x(double x) {this.x=x;}
	//public void y(double y) {this.y=y;}
	
	// getters
	public double x() {return x;}
	public double y() {return y;}
	
	public double distancia( Coord c ) {
		double diffX = x-c.x;
		double diffY = y-c.y;
		return Math.sqrt(diffX*diffX + diffY*diffY);
	}
	
	public Coord desloca( double deslocaX, double deslocaY ) {
		x += deslocaX;
		y += deslocaY;
		
		return this;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public void print() {
		System.out.print( toString() );
	}
	
	public static void main(String[] args) {
		// ponto (-3,4)
		Coord c1 = new Coord(-3,4); 

		// ponto (3,-4)
		Coord c2 = new Coord(3,-4); 
		
		double d = c1.distancia(c2);
		System.out.print( "Distância de ");
		c1.print();
		System.out.print( " a ");
		c2.print();
		System.out.println( " é " + d);
		
		System.out.println ( "Nova posição de c1: " +
						     c1.desloca(c2.x(), c2.y()) ); // chamada implícita a toString()
	}

}
