public class Cliente2 {
	public String cliente;
	public int num_conta;
	private static int gerador = 1000;
	public double saldo;
	public boolean bloqueado = false;
	public static int qtd_bloqueados = 0;
	
	public void gerarConta () {
		gerador += 1;
		num_conta = gerador;
	}
	
	public Cliente2 (String nome_cliente) {
		cliente = nome_cliente;
	}
	
	public Cliente2 (String nome_cliente, double qtd_saldo) {
		cliente = nome_cliente;
		saldo = qtd_saldo;
	}
	
	public int saque (double valor) {
		if (!bloqueado) {
			if (saldo >= valor) {
				saldo -= valor;
				System.out.println("Operacao realizada com sucesso!");
				return 1;
			}
			else {
				System.out.println("Nao ha saldo suficiente para este saque");
				return 0;
			}
		}
		System.out.println("Conta bloqueada");
		return 0;
	}
	
	// nao eh possivel fazer deposito com a conta bloqueada
	public int deposito(double valor) {
		if (!bloqueado) {
			saldo += valor;
			return 1;
		}
		return 0;
	}
	
	public void imprimeDados() {
		System.out.println("Nome: " + cliente);
		System.out.println("Num. conta: " + num_conta);
		System.out.println("Saldo disponivel: " + saldo);
		if (bloqueado == false)
			System.out.println("Estado da conta: ativa");
		else
			System.out.println("Estado da conta: bloqueada");
	}
	
	public boolean saldoDisponivelEhMaior (double valor) {
		if (saldo >= valor)
			return true;
		else 
			return false;
	}
	
	public boolean verificaNome (String nome) {
		if (cliente.matches(nome))
			return true;
		else
			return false;
	}
	
	public void bloquear() {
		if (saldo < 0) {
			bloqueado = true;
			qtd_bloqueados += 1;
		}
		else
			bloqueado = false;
	}
}
