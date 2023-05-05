
public class Treinador {
	private String nome;
	private Pokemon[] pokemons;
	private Item[] itens;
	
	public Treinador(String n, Pokemon[] p, Item[] i){
		setNome(n);
		setPokemons(p);
		setItens(i);
	}
	
	public void setNome(String n){
		nome = n;
	}
	public String getNome(){
		return nome;
	}
	public Pokemon[] getPokemons() {
		return pokemons;
	}
	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}
	public Item[] getItens() {
		return itens;
	}

	public void setItens(Item[] itens) {
		this.itens = itens;
	}
}
