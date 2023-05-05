package br.usp.ime.p2.ex4;

public class FactoryRefrigerante extends Refrigerante {
	public Refrigerante getRefrigerante(String nome, boolean diet) {
		if (nome.equals("CocaCola")) {
			if (diet)
				return new CocaColaZero();
			else
				return new CocaCola();
		}
		else {
			if (diet)
				return new PepsiZero();
			else
				return new Pepsi();
		}
	}
}
