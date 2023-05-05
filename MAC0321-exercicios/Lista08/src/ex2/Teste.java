package ex2;

/*
 * Abaixo, seguem os testes referentes aos pedidos no exerc�cio 2. 
 * 
 * Esses testes diferem dos anteriores, pois eles s�o realacionados � classe em si. Os testes pedidos nos exerc�cios das listas at� agora foram
 * testes relacionados � funcionalidade de m�todos espec�ficos.
 * 
 */


import static org.junit.Assert.*;

import org.junit.Test;

import ex1.OverflowException;
import ex1.View;

public class Teste {
	View tela = new View();

	@Test
	public void teste() throws OverflowException{
		tela.MontarTela();
		tela.MostrarTela();
		
		tela.setInput("4");
		tela.clicar();
		
		assertEquals(tela.getResultado(), "24");
	}
	
	@Test
	public void testeOverflow() throws OverflowException{
		tela.MontarTela();
		tela.MostrarTela();
		
		tela.setInput("14");
		tela.clicar();
		
		assertEquals(tela.getResultado(), "overflow");
	}
	
	@Test
	public void testeNegativo() throws OverflowException{
		tela.MontarTela();
		tela.MostrarTela();
		
		tela.setInput("-2");
		tela.clicar();
		
		assertEquals(tela.getResultado(), "nao existe");
	}
	
	@Test
	public void testeFormato() throws OverflowException{
		tela.MontarTela();
		tela.MostrarTela();
		
		tela.setInput("ABS");
		tela.clicar();
		
		assertEquals(tela.getResultado(), "nao existe");
	}
}
