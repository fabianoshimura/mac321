package br.usp.ime.p2.ex3;

import java.util.*;

public class Jogo {
	private int vencidas, perdidas, empatadas;
	private Stack<Mao> jogadas1 = new Stack<Mao>();
	private Stack<Mao> jogadas2 = new Stack<Mao>();
	
	/**
	 * Adiciona a mão jogada pelo jogador 1.
	 * 
	 * @param mao
	 *            A mão jogada pelo jogador 1.
	 * 
	 * @throws MaoInvalida
	 *             Essa exceção é lançada se for jogada uma mão sem 
	 *             sentido para o jogo.
	 **/
	public void adicionaMaoDoJogador1(Mao mao) throws MaoInvalida {
		if (mao.getDedos() != 0 && mao.getDedos() != 2 && mao.getDedos() != 5)
			throw new MaoInvalida();
		else
			jogadas1.push(mao);
	}
	
	/**
	 * Adiciona a mão jogada pelo jogador 2.
	 * 
	 * @param mao
	 *            A mão jogada pelo jogador 2.
	 * 
	 * @throws MaoInvalida
	 *             Essa exceção é lançada se for jogada uma mão sem 
	 *             sentido para o jogo.
	 **/
	public void adicionaMaoDoJogador2(Mao mao) throws MaoInvalida {
		if (mao.getDedos() != 0 && mao.getDedos() != 2 && mao.getDedos() != 5)
			throw new MaoInvalida();
		else
			jogadas2.push(mao);
	}
	
	/**
	* Escreve o resultado no stdout [1 (vitória), 0 (empate), 
	* -1 (derrota) relativamente ao jogador 1] para cada jogada 
	* realizada pelos dois jogadores.
	*
	* @throws PartidaInvalida 
	* 	Essa exceção é lançada caso os dois jogadores tenham jogado 
	*     um numero distinto de jogadas.
	**/
	public void escreveResultado() throws PartidaInvalida {
		if (jogadas1.size() != jogadas2.size())
			throw new PartidaInvalida();
	
		Iterator<Mao> iterator1 = jogadas1.iterator();
		Iterator<Mao> iterator2 = jogadas2.iterator();
		
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next().contra(iterator2.next()));
		}
	}
}
