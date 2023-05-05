
public class exercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente teste = new ContaCorrente("Bruno", 40028922, 9349631);
		ContaCorrente teste2 = new ContaCorrente("Bruno2", 12345678);
	
		teste.imprime();
		
		teste.setNome("Yukio");
		teste.imprime();
		
		System.out.println("Testando o valor do campo estatico no metodo getNome: " + teste.getNome() + "\n");
		
		teste2.imprime();
	}

}
