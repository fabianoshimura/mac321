class Inteiro {
	private int i;
	/* Corrigimos aqui!
	public void Inteiro(int j){
		i = j;
	} 
	*/ 
	public void setInt(int j){
		i = j;
	}
	public int getInt(){
		return i;
	} 
}

public class exercicio4_TesteInteiro{
	public static void main(String[] args){ // Corrigimos aqui também!!!
		Inteiro obj;
		obj = new Inteiro();
		System.out.println(" O objeto contém: " + obj.getInt());
		obj.setInt(4);
		System.out.println(" O objeto contém: " + obj.getInt());
	}
}

/*
 * A classe Inteiro possuía uma função com o mesmo nome da classe, portanto havia um conflito na 
 * criação do construtor, e essa função não era utilizada no main, podendo assim, ser excluída do 
 * código.
 * Além disso, a classe não possuía uma função main.
 */
