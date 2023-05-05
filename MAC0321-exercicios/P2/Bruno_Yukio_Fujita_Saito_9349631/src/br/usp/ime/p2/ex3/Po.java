package br.usp.ime.p2.ex3;

public class Po extends Mao {
	
	public Po() {
		this.nome = "Po";
		this.qtd_dedos = 5;
	}
	
	public int contra(Mao mao) {
		if (mao.getNome().equals("Jo"))
			return 1;
		else if (mao.getNome().equals("Kem"))
			return -1;
		return 0;
	}
}
