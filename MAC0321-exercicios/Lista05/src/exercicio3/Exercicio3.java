package exercicio3;

public class Exercicio3 extends Base {
	Exercicio3() {
		System.out.println("Constrói derivada");
	}
	
	public static void main(String []argc){
		Exercicio3 obj = new Exercicio3();
    }
}

// A mensagem de erro que aparece é "The type exercicio3 cannot subclass the final class Base", pois a classe "Base"
// é "final" e não pode ser derivada.