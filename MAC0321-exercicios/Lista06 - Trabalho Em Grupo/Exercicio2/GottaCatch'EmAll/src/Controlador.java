
public class Controlador {

	private EventoSet es = new EventoSet();
	
	public void addEvent(Evento c) { 
		es.add(c); 
	}
	
	public void execute() {
		Evento e = es.getNext();
		e.acao();
		System.out.println(e.descricao());
		es.removeCurrent();
	}
	
	public void run() {
		Evento e, f;
		
		while((e = es.getNext()) != null) {
			if (e.getPrioridade() == 0) {
				System.out.println(e.descricao());
				es.removeCurrent();
				break;
			}
			else if (e.getPrioridade() == -2) {
				e.acao();
				es.removeCurrent();
				break;
			}
			else {
				f = es.viewNext();
				if (e.getPrioridade() <= f.getPrioridade()) {
					e.acao();
					System.out.println(e.descricao());
					es.removeCurrent();
					
					es.getNext().acao();
					System.out.println(f.descricao());
					es.removeCurrent();
				} else if (e.getPrioridade() > f.getPrioridade()) {
					f.acao();
					System.out.println(f.descricao());
					e.acao();
					System.out.println(e.descricao());
					es.removeCurrent();
					es.getNext();
					es.removeCurrent();
				}
			}
		}
	}
}
