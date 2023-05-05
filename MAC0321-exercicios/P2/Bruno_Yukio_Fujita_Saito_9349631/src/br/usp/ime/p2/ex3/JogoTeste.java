package br.usp.ime.p2.ex3;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *  Proposta de exercício para o teste da turma 1 - Testes unitários com o JUnit 
 */

public class JogoTeste {
	private Jogo jogo;
	private final ByteArrayOutputStream saida = new ByteArrayOutputStream();
	
	@Before
	public void inicializacao() {
		jogo = new Jogo();
		System.setOut(new PrintStream(saida));
	}

	@Test
	public void testeVitoriaJogador1() throws MaoInvalida, PartidaInvalida {
		jogo.adicionaMaoDoJogador1(new Jo());
		jogo.adicionaMaoDoJogador2(new Kem());
		
		jogo.adicionaMaoDoJogador1(new Kem());
		jogo.adicionaMaoDoJogador2(new Po());
		
		jogo.adicionaMaoDoJogador1(new Po());
		jogo.adicionaMaoDoJogador2(new Jo());
		
		jogo.escreveResultado();
		
		assertEquals("1\n1\n1\n", saida.toString());
	}
	
	@Test
	public void testeDerrotaJogador1() throws MaoInvalida, PartidaInvalida {
		jogo.adicionaMaoDoJogador1(new Kem());
		jogo.adicionaMaoDoJogador2(new Jo());
		
		jogo.adicionaMaoDoJogador1(new Po());
		jogo.adicionaMaoDoJogador2(new Kem());
		
		jogo.adicionaMaoDoJogador1(new Jo());
		jogo.adicionaMaoDoJogador2(new Po());
		
		jogo.escreveResultado();
		
		assertEquals("-1\n-1\n-1\n", saida.toString());
	}
	
	@After
	public void finalizacao() {
	    System.setOut(null);
	}
}
