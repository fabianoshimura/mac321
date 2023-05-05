public class exercicio2_classeTeste {
	
    public static void main (String args[]) {
    	exercicio2_fatorial obj = new exercicio2_fatorial();
		
		if (120 == obj.fatorial(5)){
			System.out.println("CORRETO\n");
		}
		if (24 == obj.fatorial(4)){
			System.out.println("CORRETO\n");
		}
		if (6 == obj.fatorial(3)){
			System.out.println("CORRETO\n");
		}
		if (2 == obj.fatorial(2)){
			System.out.println("CORRETO\n");
		}
		if (1 == obj.fatorial(1)){
			System.out.println("CORRETO\n");
		}
    }
}
