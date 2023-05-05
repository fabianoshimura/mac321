package ex2;

/*
 * Abaixo, seguem os testes referentes aos pedidos no exercício 2. 
 * 
 * Esses testes diferem dos anteriores, pois eles são realacionados à classe em si. Os testes pedidos nos exercícios das listas até agora foram
 * testes relacionados à funcionalidade de métodos específicos.
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
