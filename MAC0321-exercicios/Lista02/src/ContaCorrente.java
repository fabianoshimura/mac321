public class ContaCorrente {
	private String nome;
	private int nconta;
	private double saldo;
	private static String banco = "O BANCO";
	
	public void setNome (String n) {
		if (banco.equals("O BANCO")) {
			nome = n;
		}
	}
	
	public String getNome() {
		if (banco.equals("O BANCO")) {
			return nome;
		}
		
		return null;
	}
	
	public ContaCorrente(String n, int c, double s) {
		if (banco.equals("O BANCO")) {
			nome = n;
			nconta = c;
			saldo = s;
		}
	}
	
	public ContaCorrente(String n, int c) {
		if (banco.equals("O BANCO")) {
			nome = n;
			nconta = c;
		}
	}
	
	public void imprime () {
		System.out.println("Nome: " + nome);
		System.out.println("Numero da conta: " + nconta);
		System.out.println("Saldo: " + saldo);
		System.out.println("Banco: " + banco + "\n");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
