package br.usp.ime.p2.ex3;

public class Jogo {
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
	public void adicionaMaoDoJogador1(Mao mao) throws MaoInvalida {}
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
	public void adicionaMaoDoJogador2(Mao mao) throws MaoInvalida {}
	/**
	* Escreve o resultado no stdout [1 (vitória), 0 (empate), 
	* -1 (derrota) relativamente ao jogador 1] para cada jogada 
	* realizada pelos dois jogadores.
	*
	* @throws PartidaInvalida 
	* 	Essa exceção é lançada caso os dois jogadores tenham jogado 
	*     um numero distinto de jogadas.
	**/
	public void escreveResultado() throws PartidaInvalida {}
}

}
