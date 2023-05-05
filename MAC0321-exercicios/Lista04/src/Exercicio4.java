
public class Exercicio4 implements Interface1, Interface2 {
	public void metodo11() {
		System.out.println("O metodo 11 foi chamado!");
	}
	
	public void metodo12() {
		System.out.println("O metodo 12 foi chamado!");
	}

	public void metodo21() {
		System.out.println("O metodo 21 foi chamado!");
	}
	
	public void metodo22() {
		System.out.println("O metodo 22 foi chamado!");
	}
	
	public static void main (String[] args) {
		Exercicio4 e = new Exercicio4();
		Interface1 i1 = new ObjInterface1();
		Interface2 i2 = new ObjInterface2();
		
		// o objeto "i1", contém esses dois métodos da "Interface1".
		i1.metodo11(); 
		i1.metodo12();
		// i1.metodo21();  <- essa chamada é inválida, pois metodo21() está
		//                    contido na "Interface2".
		// "i2", por sua vez contém os métodos da "Interface2".
		i2.metodo21();
		i2.metodo22();
		// i2.metodo11();  <- analogamente, essa chamada também não é válida.
		
		// Agora, pára o objeto "e", que implementa ambas as interfaces anteriores
		// todas as chamadas são válidas, pois este objeto contém todos os métodos.
		e.metodo11();
		e.metodo12();
		e.metodo21();
		e.metodo22();
	}
}	
