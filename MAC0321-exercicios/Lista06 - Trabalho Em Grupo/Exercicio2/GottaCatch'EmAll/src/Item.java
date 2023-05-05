
public class Item {
	private String nome;
	private int cura;
	
	public Item(String n, int c) {
		setCura(c);
		setNome(n);
	}
	
	public int getCura() {
		return cura;
	}
	public void setCura(int cura) {
		this.cura = cura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
