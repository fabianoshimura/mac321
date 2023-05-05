public class exercicio2_fatorial {
	
    public int fatorial (int n) {
	int res = 1;
   
	while (n > 0) {
	    res *= n;
	    n--;
	}

	return res;
    }
}
