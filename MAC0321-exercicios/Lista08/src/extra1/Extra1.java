package extra1;

class Extra1 implements Runnable {
	   private Thread t;
	   private String nome;
	   private int n;
	   
	   Extra1(String n, int i){
	       nome = n;
	       this.n = i;
	       System.out.println("Criou " +  n );
	   }
	   
	   public void run() {
	     System.out.println("Rodando " +  nome );
	     for(int i = 1; i <= n; i++) {
		    System.out.println("Thread: " + nome + ", i = " + i);
		 }
	     System.out.println(nome + " encerrada.");
	   }
	   
	   public void start() {
	      System.out.println("Iniciando " +  nome );
	      
	      if (t == null) {
	         t = new Thread(this, nome);
	         t.start();
	      }
	   }

	}
