
import java.util.Random;

public class Mapa {
	char mapa[][];
	Random r = new Random();
	final static double probAchar = 1;	// probabilidade de encontrar um pokemon selvagem
	public int x = 0, y = 0;	// posicao do jogador
	int i, j;	// tamanho do mapa
	
	/*
	 *  '@' = jogador
	 *  '*' = matinho
	 *  '0' = chão comum
	 */
	
	public Mapa (int i, int j) {
		this.i = i;
		this.j = j;
		criarMapa(mapa, i , j);
	}
	
	class MovBaixo extends Evento {
		
		public MovBaixo() {
			super(-2);
		}
		public void acao() {
			x++;
			
			imprimeMapa();
		}
		public String descricao() {
			// TODO Auto-generated method stub
			return "";
		}
	}
	
	class MovEsquerda extends Evento {
		
		public MovEsquerda() {
			super(-2);
		}
		public void acao() {
			y--;
			
			imprimeMapa();
		}
		public String descricao() {
			// TODO Auto-generated method stub
			return "";
		}
	}
	
	class MovCima extends Evento {
		int xAtual, yAtual;
		
		public MovCima() {
			super(-2);
		}
		public void acao() {
			x--;
			
			imprimeMapa();
		}
		public String descricao() {
			// TODO Auto-generated method stub
			return "";
		}
	}
	
	class MovDireita extends Evento {
		public MovDireita() {
			super(-2);
		}
		public void acao() {
			y++;
			imprimeMapa();
		}
		public String descricao() {
			// TODO Auto-generated method stub
			return "";
		}
	}

	public void imprimeMapa() {
		String linha = "";
		char e;
		
		for (int i = 0; i < this.i; i++) {
			for (int j = 0; j < this.j; j++) {
				if(i == x && j == y) 
					e = '@';
				else 
					e = mapa[i][j];
				
				linha += e + " ";
			}
			System.out.println(linha);
			linha = "";
		}
		System.out.println("");
	}
	
	public void criarMapa(char[][] mapa, int i, int j) {
		char m;
		Random r = new Random();
		r.setSeed(42);
		double n = r.nextDouble();
		
		mapa = new char[i][j];
		
		for (int x = 0; x < i; x++) {
			for (int y = 0; y < j; y++) {
				if (n < 0.5) {
					mapa[x][y] = '*';
					// matinho
				}
				else {
					mapa[x][y] = '0';
					// chão frio e inóspito;
				}
				n = r.nextDouble();
			}
		}
		
		this.mapa = mapa;
	}

	public boolean achouPokemon () {
		if (mapa[x][y] == '*' && r.nextDouble() <= probAchar) {
			return true;
		}
		return false;
	}
	
	public double pokemonSelvagem () {
		return r.nextDouble();
	}

}
