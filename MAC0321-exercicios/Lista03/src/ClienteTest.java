import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {
	Cliente cliente = new Cliente("teste", 100);
	
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
		cliente.saque(valor);
		assertEquals(valor_esperado, cliente.saldo, 10E-15);
	}
	
	@Test
	public void teste_saque_indisponivel() {
		double valor = 101;
		double valor_esperado = cliente.saldo - valor;
		cliente.saque(valor);
		assertEquals(valor_esperado, cliente.saldo, 10E-15);
	}
	
	@Test
	public void teste_deposito() {
		double valor = 100;
		double valor_esperado = cliente.saldo + 100;
		cliente.deposito(valor);
		assertEquals(valor_esperado, cliente.saldo, 10E-15);
	}
	
	@Test
	public void teste_imprimeDados() {
		cliente.gerarConta();
		cliente.imprimeDados();
		
		assertEquals("Nome: teste\nNum. conta: 1001\nSaldo disponivel: 100.0\n", outContent.toString());
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
}