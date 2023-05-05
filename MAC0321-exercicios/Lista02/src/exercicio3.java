import java.util.Random;

public class exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random numero = new Random();
		double numAleatorio = numero.nextDouble();
		
		for (int i = 0; i < 20; i++) {
			System.out.println(numAleatorio);
			numAleatorio = numero.nextDouble();
		}
	}

}
