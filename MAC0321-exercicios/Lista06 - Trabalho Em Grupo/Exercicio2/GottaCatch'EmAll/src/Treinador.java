
public class Treinador {
	private String nome;
	private Pokemon[] pokemons;
	private Item[] itens;
	
	public Treinador(String n, Pokemon[] p, Item[] i){
		setNome(n);
		setPokemons(p);
		setItens(i);
	}
	
	public void imprimeMochila() {
		for (int i = 0; i < itens.length; i++) {
			System.out.println("(" + i + ") " + itens[i].getNome());
		}
	}
	
	public void imprimePokemons() {
		for (int i = 0; i < pokemons.length; i++) {
			System.out.println("(" + i + ") " + pokemons[i].getNome());
		}
	}
	
	// verifica se o treinador possui algum pokemon vivo
	public boolean treinadorVivo() {
		for (int i = 0; i < pokemons.length; i++) {
			if (pokemons[i].getHP() > 0) 
				return true;
		}
		
		return false;
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
