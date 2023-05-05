package br.usp.ime.p2.ex3;

public abstract class Mao {
	public int qtd_dedos;
	public String nome;
	
	abstract int contra(Mao mao);
	
	int getDedos() {
		return qtd_dedos;
	}
	
	String getNome() {
		return nome;
	}
}
