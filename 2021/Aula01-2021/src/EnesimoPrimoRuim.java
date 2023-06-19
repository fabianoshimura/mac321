
public class EnesimoPrimoRuim {
	// Para traduzir C --> Java, adicionar "private static"
	//  diante de TODAS as variáveis e funções, exceto main
	private int[] primes;
    private int len;

    private boolean isPrime(int k) {
        for (int i = 0; i < len; i++) {
            if (2 * primes[i] > k)
                return true;
            else if ((k % primes[i]) == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java NthPrime n");
            System.exit(1);
        }
        int n = Integer.parseInt(args[0]);
        if (n <= 0) {
            System.err.println("n must be " 
                                 + "greater than zero");
            System.exit(1);
        }
        
        primes = new int[n];
        len = 0;
        EnesimoPrimoRuim p = new EnesimoPrimoRuim();
        for (int i = 2; len < n; i++) {
            if (p.isPrime(i))
                primes[len++] = i;
        }
        System.out.println(primes[len - 1]);
    }                        // end of main method
    

}
