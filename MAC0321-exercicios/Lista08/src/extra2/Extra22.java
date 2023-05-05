package extra2;

public class Extra22 implements Runnable{
	private Thread t;
	private String nome;
	private int n;
	private StringBuffer sb;
	
	Extra22(String n, StringBuffer sb, int i) {
	       nome = n;
	       this.n = i;
	       this.sb = sb;
	       System.out.println("Criou " +  n );
	}
	
	public void run() {
	     System.out.println("Rodando " +  nome );
	     for(int i = 0; i <= n; i++) {
	    	 sb.append("a");
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