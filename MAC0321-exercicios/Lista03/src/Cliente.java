import javax.swing.*;

public class Cliente {
	public String cliente;
	public int num_conta;
	private static int gerador = 1000;
	public double saldo;
	
	public void gerarConta () {
		gerador += 1;
		num_conta = gerador;
	}
	
	public Cliente (String nome_cliente) {
		cliente = nome_cliente;
	}
	
	public Cliente (String nome_cliente, double qtd_saldo) {
		cliente = nome_cliente;
		saldo = qtd_saldo;
	}
	
	public void saque (double valor) {
		saldo -= valor;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void imprimeDados() {
		System.out.println("Nome: " + cliente);
		System.out.println("Num. conta: " + num_conta);
		System.out.println("Saldo disponivel: " + saldo);
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
	
	public static void main(String[] args) {
		Cliente teste = new Cliente("teste", 100);
		teste.gerarConta();
		
		teste.imprimeDados();
	}
}
