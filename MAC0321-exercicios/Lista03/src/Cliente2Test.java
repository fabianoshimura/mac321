import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

public class Cliente2Test {
	Cliente2 cliente = new Cliente2("teste", 100);
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void  teste_gerarConta() {
		int valor_esperado = 1002;
		cliente.gerarConta();
		assertEquals(valor_esperado, cliente.num_conta);
	}
	
	@Test
	public void teste_saque_disponivel() {
		double valor = 100;
		double valor_esperado = cliente.saldo - valor;
		
		if (cliente.bloqueado == false) {
			assertEquals(1, cliente.saque(valor));
			assertEquals(valor_esperado, cliente.saldo, 10E-15);
		}
	}
	
	@Test
	public void teste_saque_indisponivel() {
		double valor = 101;
		double valor_esperado = cliente.saldo - valor;
		
		if (cliente.bloqueado == false)
			assertEquals(0, cliente.saque(valor));
	}
	
	@Test
	public void teste_saque_bloqueado() {
		cliente.bloqueado = true;
		if (cliente.bloqueado == true)
			assertEquals(0, cliente.saque(0));
	}
	
	@Test
	public void teste_deposito() {
		double valor = 100;
		double valor_esperado = cliente.saldo + 100;
		
		if (cliente.bloqueado == false) {
			assertEquals(1, cliente.deposito(valor));
			assertEquals(valor_esperado, cliente.saldo, 10E-15);
		}
	}
	
	@Test
	public void teste_deposito_bloqueado() {
		cliente.bloqueado = true;
		if (cliente.bloqueado == true)
			assertEquals(0, cliente.deposito(0));
	}
	
	@Test
	public void teste_imprimeDados() {
		cliente.gerarConta();
		cliente.imprimeDados();
		
		if (cliente.bloqueado == false)
			assertEquals("Nome: teste\nNum. conta: 1001\nSaldo disponivel: 100.0\nEstado da conta: ativa\n", outContent.toString());
		else
			assertEquals("Nome: teste\nNum. conta: 1001\nSaldo disponivel: 100.0\nEstado da conta: bloqueada\n", outContent.toString());
	}
	
	@Test
	public void teste_saldoDisponivelEhMaior() {
		assertTrue(cliente.saldoDisponivelEhMaior(50));
		assertFalse(cliente.saldoDisponivelEhMaior(150));
	}
	
	@Test
	public void teste_verificaNome() {
		assertTrue(cliente.verificaNome("teste"));
		assertFalse(cliente.verificaNome(""));
	}
	
	@Test
	public void teste_bloquear_true() {
		if (cliente.saldo < 0) {
			assertTrue(cliente.bloqueado);
			cliente.qtd_bloqueados = 1;
		}
	}
	
	@Test
	public void teste_bloquear_false() {
		if (cliente.saldo >= 0)
			assertFalse(cliente.bloqueado);
	}
}
