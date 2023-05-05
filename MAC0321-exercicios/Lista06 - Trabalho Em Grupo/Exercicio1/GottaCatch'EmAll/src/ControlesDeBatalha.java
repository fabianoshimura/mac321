
public class ControlesDeBatalha extends Controlador {

	private Pokemon poke1;
	private Pokemon poke2;
	private Treinador treinador1;
	private Treinador treinador2;
	
	class Atacar extends Evento{
		Pokemon x, y;
		Pokemon[] g, h;
		private int dano;
		private int type;
		private String nome;

		public Atacar(Treinador treAtaca, Treinador treAtacado, int ataque, int pokeAtaca) {
			super(3 + treAtaca.getPokemons()[pokeAtaca].getAtaques()[ataque].getPrioridadeAtaque());
			dano = treAtaca.getPokemons()[pokeAtaca].getAtaques()[ataque].getDano();
			type = treAtaca.getPokemons()[pokeAtaca].getAtaques()[ataque].getType();
			nome = treAtaca.getPokemons()[pokeAtaca].getAtaques()[ataque].getNome();
			g = treAtaca.getPokemons();
			h = treAtacado.getPokemons();
		}
		public void acao(){
			int e = 0, i = 0;
			while (e != 1){
				e = g[i].getEstado();
				i++;
			}
			x = g[i - 1];
			i = e = 0;
			while (e != 1){
				e = h[i].getEstado();
				i++;
			}
			y = h[i - 1];
			y.atacado(dano);
			
		}
		public String descricao(){
			String d = x.getNome() + ", use o " + nome + "!\n";
			d = d + y.getNome() + ": " + y.getHP() + " HP\n";
			if(alguemMorreu()){
				d = d + y.getNome() + " desmaiou!";
			}
			return d;
		}
		public int getPri(){
			return getPrioridade();
		}
		public boolean alguemMorreu(){
			if(x.getHP() == 0 || y.getHP() == 0)
				return true;
			return false;
		}
	}
	
	private class UsarItem extends Evento{
		private Pokemon c;
		private Item i;
		private Treinador t;

		public UsarItem(Treinador t, int poke, int item) {
			super(2);
			c = t.getPokemons()[poke];
			this.t = t;
			i = t.getItens()[item];
			
		}
		public void acao() {
			c.cura(i.getCura());
		}
		public String descricao() {
			String d = "O treinador " + t.getNome() + " usou " + i.getNome() + " no Pokemon " + c.getNome();
			d = d + "\n" + c.getNome() + ": " + c.getHP() + " HP\n";
			return d;
		}
	}
	
	private class TrocarPokemon extends Evento {
		Pokemon c, d, e, f;

		public TrocarPokemon(int poke1, int poke2) {
			super(1);
			c = treinador1.getPokemons()[poke1];
			d = treinador2.getPokemons()[poke2];
		}
		public void acao() {
			if (poke1 == c){
				e = poke2;
				f = d;
			} else {
				e = poke1;
				f = c;
			}
			poke1.alteraPokemon(0);
			poke2.alteraPokemon(0);
			c.alteraPokemon(1);
			d.alteraPokemon(1);
			poke1 = c;
			poke2 = d;
		}
		public String descricao() {
			String d = "Você lutou bem " + e.getNome() + ", volte! Vai " + f.getNome() + "!";
			return d;
		}
	}

	
	private class Fugir extends Evento{

		public Fugir() {
			super(0);
		}
		public void acao() {
			// TODO Auto-generated method stub
		}
		public String descricao() {
			String d = "O treinador(a) " + treinador1.getNome() + " fugiu.";
			return d;
		}
	}
	
	private class Reiniciar extends Evento {

		public Reiniciar() {
			super(-1);
			poke1 = treinador1.getPokemons()[0];
			poke2 = treinador2.getPokemons()[0];
		}

		public void acao() {
			addEvent(new Atacar(treinador1, treinador2, 0, 0));
			addEvent(new Atacar(treinador2, treinador1, 0, 0));
			
			addEvent(new Atacar(treinador1, treinador2, 1, 0));
			addEvent(new Atacar(treinador2, treinador1, 1, 0));
			
			addEvent(new TrocarPokemon(0, 1));
			addEvent(new Atacar(treinador1, treinador2, 1, 0));
			
			addEvent(new TrocarPokemon(1, 1));
			addEvent(new Atacar(treinador2, treinador1, 1, 1));
			
			addEvent(new UsarItem(treinador1, 0, 0));
			addEvent(new UsarItem(treinador2, 0, 0));
			
			addEvent(new UsarItem(treinador1, 1, 1));
			addEvent(new UsarItem(treinador2, 1, 1));
			
		}
		public String descricao() {
			return "Iniciando nova batalha!\n";
		}
	}
	
	public static void main(String [] args){
		ControlesDeBatalha cb = new ControlesDeBatalha();
		Pokemon[] p1 = new Pokemon[5];
		Pokemon[] p2 = new Pokemon[5];
		
		Ataque[] a10 = new Ataque[3];
		a10[0] = new Ataque("Hyperbeam", 1, 30, 1);
		a10[1] = new Ataque("Confusion", 1, 10, 2);
		p1[0] = new Pokemon(100, 1, "Kirlia", a10, 1);
		
		Ataque[] a11 = new Ataque[3];
		a11[0] = new Ataque("Pyschic", 1, 40, 1);
		a11[1] = new Ataque("Hidden Power", 1, 20, 2);
		p1[1] = new Pokemon(100, 1, "Alakazam", a11, 0);
		/*
		 * t1[1] = new Pokemon(100, 1, "Alakazam");
		t1[2] = new Pokemon(100, 1, "Mew");
		t1[3] = new Pokemon(100, 1, "Eevee");
		t1[4] = new Pokemon(100, 1, "Ninetales");
		t1[5] = new Pokemon(100, 1, "Chikorita");
		 */
		
		Ataque[] a20 = new Ataque[3];
		a20[0] = new Ataque("Splash", 1, 1, 2);
		a20[1] = new Ataque("Rain", 1, 2, 1);
		p2[0] = new Pokemon(100, 1, "Magikarp", a20, 1);
		
		Ataque[] a21 = new Ataque[3];
		a21[0] = new Ataque("Bubbles", 1, 40, 0);
		a21[1] = new Ataque("Bite", 1, 20, 1);
		p2[1] = new Pokemon(100, 1, "Totodile", a21, 0);
		
		/*
		t2[2] = new Pokemon(100, 1, "Bulbasaur");
		t2[3] = new Pokemon(100, 1, "Hypno");
		t2[4] = new Pokemon(100, 1, "Onyx");
		t2[5] = new Pokemon(100, 1, "Mewtwo");
		 */
		
		Item[] i1 = new Item[2];
		i1[0] = new Item("Full Restore", 8000);
		i1[1] = new Item("Potion", 20);
		
		Item[] i2 = new Item[2];
		i2[0] = new Item("Berry", 2);
		i2[1] = new Item("Energy Root", 200);
		
		cb.treinador1 = new Treinador("Eu", p1, i1);
		cb.treinador2 = new Treinador("Você", p2, i2);
		
		cb.addEvent(cb.new Reiniciar());
		cb.run();
	}
}