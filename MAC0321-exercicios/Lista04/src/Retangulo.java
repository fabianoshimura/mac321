
public class Retangulo implements Figura2D {
	double a, l;
	String cor;
	
	public double calculaArea() {
		return a * l;
	}
	
	public double calculaPerimetro() {
		return 2 * a + 2 * l;
	}
	
	public void mudaCor(String cor) {
		this.cor = cor;
	}
	
	public String pegaCor() {
		return cor;
	}
}
