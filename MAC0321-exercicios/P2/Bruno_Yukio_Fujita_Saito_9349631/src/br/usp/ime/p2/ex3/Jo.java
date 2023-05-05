package br.usp.ime.p2.ex3;

public class Jo extends Mao {
	
	public Jo() {
		this.nome = "Jo";
		this.qtd_dedos = 0;
	}
	
	public int contra(Mao mao) {
		if (mao.getNome().equals("Kem"))
			return 1;
		else if (mao.getNome().equals("Po"))
			return -1;
		return 0;
	}
}
