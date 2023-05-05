package ex2;

public class Controller {
	
	public int fatorial (int n) {
		int res = 1;
	   
		while (n > 0) {
		    res *= n;
		    n--;
		}

		return res;
	}
	
	public static void main (String args[]) throws OverflowException {
		View tela = new View();
		
		tela.MontarTela();
		tela.MostrarTela();
	}
}

