
public class EventoSet {
	private Evento[] events = new Evento[100];
	private int index = 0;
	private int next = 0;
	public void add(Evento e) {
		if(index >= events.length)
			return;
		events[index++] = e;
	}
	public Evento getNext() {
		boolean looped = false;
		int start = next;
		do {
			next = (next + 1) % events.length;
			if(start == next) looped = true;
			if((next == (start + 1) % events.length) && looped)
				return null;
		} while(events[next] == null);
		return events[next];
	}
	public Evento viewNext() {
		return events[next + 1];
	}
	public void removeCurrent() {
		events[next] = null;
	}
}
