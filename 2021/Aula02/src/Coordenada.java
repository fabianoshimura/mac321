
public class Coordenada {
	private double x;
	private double y;

	// setter
	public void setX(double v) {x=v;}
	public void setY(double v) {y=v;}
	
	// getter
	public double getX() {return x;}
	public double getY() {return y;}
	
	public double distancia(Coordenada c ) {
		double diffX = x-c.x;
		double diffY = y-c.y;
		return Math.sqrt(diffX*diffX + diffY*diffY);
	}
	
	public void desloca( double deslocaX, double deslocaY ) {
		x += deslocaX;
		y += deslocaY;
	}
	
	public void print() {
		System.out.print("(" + x + "," + y + ")" );
	}
	
	public static void main(String[] args) {
		// ponto (-3,4)
		Coordenada c1 = new Coordenada(); 
		c1.setX(-3);
		c1.setY(4);
		// ponto (3,-4)
		Coordenada c2 = new Coordenada(); 
		c2.setX(3);
		c2.setY(-4);
		
		double d = c1.distancia(c2);
		System.out.print( "Distância de ");
		c1.print();
		System.out.print( " a ");
		c2.print();
		System.out.println( " é " + d);
		
		c1.desloca(c2.getX(), c2.getY());
		System.out.print( "Nova posição de c1: ");
		c1.print();
		System.out.println();
	}
}
