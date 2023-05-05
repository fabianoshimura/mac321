
public class Fibonacci {
	 public static int fibonacci (int n) {
	        int f1 = 1, f2 = 1, numero = 1;
	        
	        if (n < 0) return -1;
	        
	        for (int i = 2; i < n; i++) {
	            numero = f1 + f2;
	            f1 = f2;
	            f2 = numero;
	        }
	        
	        return numero;
	    }
}
