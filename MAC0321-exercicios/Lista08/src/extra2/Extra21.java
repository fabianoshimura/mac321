package extra2;

public class Extra21 implements Runnable {
	private Thread t;
	private String nome;
	private int n;
	private String s;
	
	Extra21(String n, String s, int i) {
	       nome = n;
	       this.n = i;
	       this.s = s;
	       System.out.println("Criou " +  n );
	}
	
	public void run() {
	     System.out.println("Rodando " +  nome );
	     for(int i = 0; i <= n; i++) {
	    	 s += "a";
		 }
	     System.out.println("** " + nome + " encerrada. **");
	   }
	   
	   public void start() {
	      System.out.println("Iniciando " +  nome );
	      
	      if (t == null) {
	         t = new Thread(this, nome);
	         t.start();
	      }
	   }
}
