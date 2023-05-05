
abstract public class Evento {

	private int prioridade;
	public Evento(int p){
		setPrioridade(p);
	}

	abstract public void acao();
	abstract public String descricao();

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
}
