import java.lang.Math;

public class exercicio1 {

	public int fatorial (int n) {
		int resultado = n;
		
		n--;
		while (n > 0) {
			resultado *= n;
			n--;
		}
		
		return resultado;
	}
	
	public double potencia (double n, int grau) {
		double resultado = 1;
		
		if (grau < 0) {
			return 1/n; 
		}
		
		for (int i = 0; i < grau; i++) {
			resultado *= n;
		}
		
		return resultado;
	}
	
	public double seno (double x) {
		double resultado = 0;
		exercicio1 teste = new exercicio1();
		
		for (int n = 0; n < 5; n++)
			resultado += (teste.potencia(-1, n) * teste.potencia(x, 2*n + 1)) / teste.fatorial(2*n + 1);
		
		return resultado;
	}
	
	public double cosseno (double x) {
		return Math.cos(x);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = Math.PI / 2;
		double eps = 0.00001;
		
		System.out.println("                 ---Calculadora de Seno---                 \n");
		exercicio1 teste = new exercicio1();
		
		if (Math.abs(Math.sin(x) - teste.seno(x)) < eps)
			System.out.println("Seno de " + x + " = " + teste.seno(x) + "  CORRETO!");
		
		System.out.println("Cosseno de " + x + " =  " + teste.cosseno(x));
	}

}
