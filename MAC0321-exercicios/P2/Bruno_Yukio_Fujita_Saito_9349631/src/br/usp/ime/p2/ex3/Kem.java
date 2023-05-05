package br.usp.ime.p2.ex3;

public class Kem extends Mao {
	
	public Kem() {
		this.nome = "Kem";
		this.qtd_dedos = 2;
	}
	
	public int contra(Mao mao) {
		if (mao.getNome().equals("Po"))
			return 1;
		else if (mao.getNome().equals("Jo"))
			return -1;
		return 0;
	}
}
