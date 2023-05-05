
public class Quadrado implements Figura2D {
	double lado;
	String cor;
	
	public double calculaArea() {
		return lado * lado;
	}
	
	public double calculaPerimetro() {
		return 4 * lado;
	}
	
	public void mudaCor(String cor) {
		this.cor = cor;
	}
	
	public String pegaCor() {
		return cor;
	}
}
