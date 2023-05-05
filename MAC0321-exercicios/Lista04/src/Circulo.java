
public class Circulo implements Figura2D {
	double r;
	String cor;
	
	public double calculaArea() {
		return Math.PI * r * r;
	}
	
	public double calculaPerimetro() {
		return 2 * Math.PI * r;
	}
	
	public void mudaCor(String cor) {
		this.cor = cor;
	}
	
	public String pegaCor() {
		return cor;
	}
}
