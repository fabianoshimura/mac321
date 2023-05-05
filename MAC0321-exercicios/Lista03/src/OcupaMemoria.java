public class OcupaMemoria {
	static int quantos = 0;
	static boolean finalizou = false;
	double a[] = new double[100];
	
	public OcupaMemoria() {
		quantos++;
	}
	
	protected void finalize() {
		if (!finalizou) {
			System.out.println("Finalizou uma vez apos criar " + quantos + " objetos");
			finalizou = true;
		}
	}
	
	public static void teste() {
		while (OcupaMemoria.finalizou == false)
			new OcupaMemoria();
	}
	
	
	public static void main(String[] args) {
		System.gc();
		teste();
		/* Após a execução do teste com um vetor de tamanho 100 e sem o uso do System.gc(), foram criados aproximadamente
		 * 38 000 objetos.
		 * Com o uso do System.gc(), houve um aumento ligeiramente maior, criando-se aproximadamente
		 * 39 000 objetos, pois a JVM reciclou objetos não utilizados para livrar espaço na memória.
		 */
	}
}

