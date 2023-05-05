public class Pokemon {
	private int HP;
	private int HPmax;
	private int type;
	private String nome;
	private int estado;
	private Ataque[] ataques;

	
	//1 = em campo
	//0 = na pokebola
	
	public Pokemon(int hpm, int tipo, String n, Ataque[] a, int e){
		HPmax = setHP(hpm);
		type = tipo;
		nome = n;
		setEstado(e);
		setAtaques(a);
	}
	
	public void atacado(int dano){
		setHP(getHP() - dano);
		if (getHP() < 0)
			setHP(0);
	}
	public void cura(int cura){
		setHP(getHP() + cura);
		if (getHP() > HPmax)
			setHP(HPmax);
	}
	public void alteraPokemon(int e){
		setEstado(e);
	}
	
	public String getNome(){
		return nome;
	}

	public Ataque[] getAtaques() {
		return ataques;
	}

	public void setAtaques(Ataque[] ataques) {
		this.ataques = ataques;
	}

	public int getHP() {
		return HP;
	}

	public int setHP(int hP) {
		HP = hP;
		return hP;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
