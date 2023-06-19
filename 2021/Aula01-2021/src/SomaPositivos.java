
public class SomaPositivos {
	public static void main(String[] args) {
	    if (args.length == 0) {
	      System.out.println("Informe uma lista de números.");
	      return;
	    }

	    int somaDosPositivos = 0;
	    int valorAtual;

	    for (int i = 0; i < args.length; i++) {
	      valorAtual = Integer.parseInt(args[i]);
	      if (valorAtual > 0)
	        somaDosPositivos += valorAtual;
	    }
	    System.out.println("O valor é: " + somaDosPositivos);
	  }

}
