
import java.util.Random;
import java.util.Scanner;

public class ControlesDeBatalha extends Controlador {
	static final int NORMAL = 1;
	
	private Pokemon poke1;
	private Pokemon poke2;
	private Treinador treinador1;
	private Treinador treinador2;
	private Treinador selvagem;
	Mapa mapa;
	Scanner sc = new Scanner(System.in);
			
	public ControlesDeBatalha (int i, int j) {
		mapa = new Mapa(i, j);
	}
	
	public ControlesDeBatalha () {
	}
	
	private class Atacar extends Evento{
		Pokemon x, y;
		Pokemon[] g, h;
		private int dano;
		private int type;
		private String nome;

		public Atacar(Treinador treAtaca, Treinador treAtacado, int ataque, Pokemon pokeAtaca) {
			super(3 + pokeAtaca.getAtaques()[ataque].getPrioridadeAtaque());
			dano = pokeAtaca.getAtaques()[ataque].getDano();
			type = pokeAtaca.getAtaques()[ataque].getType();
			nome = pokeAtaca.getAtaques()[ataque].getNome();
			x = pokeAtaca;
			g = treAtaca.getPokemons();
			h = treAtacado.getPokemons();
		}
		public void acao(){
			int e = 0, i = 0;
			if (x.getHP() > 0) {
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
		}
		public String descricao(){
			if (x.getHP() > 0) {
				String d = x.getNome() + ", use o " + nome + "!\n";
				d = d + y.getNome() + ": " + y.getHP() + " HP\n";
				if(alguemMorreu()){
					d = d + y.getNome() + " desmaiou!";
				}
				return d;
			}
			return "";
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

		public TrocarPokemon(int poke1) {
			super(1);
			c = treinador1.getPokemons()[poke1];
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
			c.alteraPokemon(1);
			poke1 = c;
		}

		public String descricao() {
			String d = "Você lutou bem " + e.getNome() + ", volte! Vai " + f.getNome() + "!";
			return d;
		}
	}

	private class Fugir extends Evento{
		Treinador qualquercoisa;

		public Fugir(Treinador qualquercoisa2) {
			super(0);
			qualquercoisa = qualquercoisa2;
			
		}
		public void acao() {
			
		}
		public String descricao() {
			String d = "O treinador(a) " + qualquercoisa.getNome() + " fugiu.";
			return d;
		}
	}

	private class Reiniciar extends Evento {

		public Reiniciar() {
			super(-1);
		}

		public void acao() {
			
		}
		
		public String descricao() {
			return "Iniciando nova batalha!\n";
		}
	}
	
	public static void main(String [] args){
		ControlesDeBatalha cb = new ControlesDeBatalha (3,4);
		
		Pokemon[] p1 = new Pokemon[2];
		
		Ataque[] a10 = new Ataque[2];
		a10[0] = new Ataque("Hyperbeam", 1, 100, 3);
		a10[1] = new Ataque("Confusion", 1, 10, 1);
		p1[0] = new Pokemon(100, 1, "Kirlia", a10, 1);
		
		Ataque[] a11 = new Ataque[2];
		a11[0] = new Ataque("Pyschic", 1, 40, 1);
		a11[1] = new Ataque("Hidden Power", 1, 20, 2);
		p1[1] = new Pokemon(100, 1, "Alakazam", a11, 0);
		
		Item[] i1 = new Item[2];
		i1[0] = new Item("Full Restore", 8000);
		i1[1] = new Item("Potion", 20);
		
		cb.treinador1 = new Treinador("Eu", p1, i1);
		cb.poke1 = cb.treinador1.getPokemons()[0];

		while (cb.treinador1.treinadorVivo()) {
			cb.mapa.imprimeMapa();
			
			System.out.println("(D) Direita   (A) Esquerda   (W) Cima   (S) Baixo");
			String decisao = cb.sc.next().toUpperCase();
			
			if (decisao.equals("D")) {
				cb.addEvent(cb.mapa.new MovDireita());
			}
			else if (decisao.equals("A")) {
				cb.addEvent(cb.mapa.new MovEsquerda());	
			}
			else if (decisao.equals("W")) {
				cb.addEvent(cb.mapa.new MovCima());
			}
			else if (decisao.equals("S")) {
				cb.addEvent(cb.mapa.new MovBaixo());
			}
			
			cb.run();
			
			if (cb.mapa.achouPokemon()) {
				
				Pokemon[] s = new Pokemon[1];
				double aux = cb.mapa.pokemonSelvagem();
				if (aux <= 0.33) {
					Ataque[] sAtaques = new Ataque[2];
					
					sAtaques[0] = new Ataque("Bite", NORMAL, 10, 2);
					sAtaques[1] = new Ataque("Mega Bite", NORMAL, 20, 2);
					s[0] = new Pokemon(100, NORMAL, "Ratata", sAtaques, 1);
				}
				else if (aux > 0.33 && aux <= 0.95) {
					Ataque[] sAtaques = new Ataque[2];
					
					sAtaques[0] = new Ataque("Bite", NORMAL, 10, 2);
					sAtaques[1] = new Ataque("Astonish", NORMAL, 20, 2);
					s[0] = new Pokemon(100, NORMAL, "Zubat", sAtaques, 1);
				}
				else {
					Ataque[] sAtaques = new Ataque[2];
					
					sAtaques[0] = new Ataque("Mega Bite", NORMAL, 2000, 2);
					sAtaques[1] = new Ataque("Ultra Bite", NORMAL, 1000, 2);
					s[0] = new Pokemon(100, NORMAL, "Mew", sAtaques, 1);
				}
				cb.poke2 = s[0];
				System.out.println("Congrats, você encontrou um " + cb.poke2.getNome() + "!!!");
				
				cb.selvagem = new Treinador("Pokemon Selvagem", s, null);
				
				decisao = "S";
				while (decisao.equals("S")) {
					while (cb.poke2.getHP() > 0 && cb.poke1.getHP() > 0) {
						System.out.println("(A) Atacar   (M) Mochila   (P) Pokemons   (F) Fugir");
						decisao = cb.sc.next().toUpperCase();
						
						if (decisao.equals("A")) {
							cb.poke1.imprimeAtaques();
							decisao = cb.sc.next().toUpperCase();
							
							cb.addEvent(cb.new Atacar(cb.treinador1, cb.selvagem, Integer.parseInt(decisao), cb.poke1));
							System.out.println("Adicionei ataque treinador");
						}
						else if (decisao.equals("M")) {
							cb.treinador1.imprimeMochila();
							decisao = cb.sc.next().toUpperCase();
							
							cb.treinador1.imprimePokemons();
							System.out.println("Usar em qual pokémon?");
							String idPokemon = cb.sc.next();
							
							cb.addEvent(cb.new UsarItem(cb.treinador1, Integer.parseInt(idPokemon), Integer.parseInt(decisao)));
						}
						else if (decisao.equals("P")) {
							cb.treinador1.imprimePokemons();
							decisao = cb.sc.next().toUpperCase();
							
							cb.addEvent(cb.new TrocarPokemon(Integer.parseInt(decisao)));
						}
						else if (decisao.equals("F")) {
							cb.addEvent(cb.new Fugir(cb.treinador1));
							cb.run();
							break;
						}
						
						// Escolher ataque do wild do pokemon
						if (!decisao.equals("F")) {
							Random r = new Random();
							double ataque = r.nextDouble() * 100;
							
							cb.addEvent(cb.new Atacar(cb.selvagem, cb.treinador1, (int) (ataque%2), cb.poke2));
							System.out.println("Adicionei ataque selvagem");
						}
						
						cb.run();
					}
				}
				
				if (cb.treinador1.treinadorVivo() && cb.poke2.getHP() > 0) {
					System.out.println("Continuar batalha? (S / N)");
					decisao = cb.sc.next().toUpperCase();
					
					if (decisao.equals("S")) {
						System.out.println("Escolha um pokémon para continuar.");
						cb.treinador1.imprimePokemons();
						decisao = cb.sc.next().toUpperCase();
						
						cb.addEvent(cb.new TrocarPokemon(Integer.parseInt(decisao)));
						cb.execute();
						decisao = "S";
					}
				}
				else if (!cb.treinador1.treinadorVivo()) {
					decisao = "N";
					System.out.println("O treinador perdeu, o jogo acabou!");
					System.out.println("Favor se dirigir ao Centro Pokemon mais próximo para voltar a jogar.");
				}
			}
		}
	}
}