package br.usp.ime.p2.ex1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class PilhaLimitadaTest {
	double limiteInferior = -100, limiteSuperior = 100;
	PilhaLimitada pilhaMenos100A100 = new PilhaLimitada(limiteInferior, limiteSuperior);

	@Test
	public void testPushNumberAtualizaTotal() {
		pilhaMenos100A100.push(new Integer(10));
		assertTotalIgual(10);
	}

	@Test
	public void testPushNumber() {
		Number n = new Integer(10);
		Number esperado = pilhaMenos100A100.push(n);
		assertEquals(esperado, n);

	}

	@Test
	public void testPop() {
		pilhaMenos100A100.push(new Integer(10));
		pilhaMenos100A100.pop();
		assertTotalIgual(0);
	}

	@Test
	public void testReturn() {
		pilhaMenos100A100.push(new Float(10.5));
		assertEquals(10.5, pilhaMenos100A100.pop().doubleValue(), Math.pow(10, -5));
	}

	@Test
	public void testPopVazio() {
		assertNull(pilhaMenos100A100.pop());

	}

	@Test
	public void numeroMaiorQueLimite() {
		assertNull(pilhaMenos100A100.push(new Integer(101)));
	}

	private void assertTotalIgual(double esperado) {
		assertEquals(esperado, pilhaMenos100A100.total(), Math.pow(10, -5));
	}
}