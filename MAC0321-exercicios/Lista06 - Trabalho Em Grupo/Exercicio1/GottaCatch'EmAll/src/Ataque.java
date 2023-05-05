
public class Ataque {

	private String nome;
	private int type;
	private int dano;
	private int prioridadeAtaque;
	
	public Ataque(String n, int t, int d, int p){
		setNome(n);
		setType(t);
		setDano(d);
		setPrioridadeAtaque(p);
	}

	public int getPrioridadeAtaque() {
		return prioridadeAtaque;
	}

	public void setPrioridadeAtaque(int prioridadeAttack) {
		this.prioridadeAtaque = prioridadeAttack;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
