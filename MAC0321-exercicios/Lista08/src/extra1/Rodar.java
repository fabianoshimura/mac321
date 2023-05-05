package extra1;

public class Rodar {
	public static void main(String args[]) {
		int n = 50;
		
		/*
		 * A partir de N = 9, o programa passa a ser efetivamente executado em paralelo. Isso foi observado a partir de diversas execu��es desse
		 * programa. Vimos que a partir na nona itera��o da primeira Thread chamada, a segunda Thread passa a ser executada tamb�m. A partir da�,
		 * nota-se que as duas Thread s�o executadas alteranando-se entre si, caracter�stico de um Multitasking.
		 * 
		 */
		
		Extra1 t1 = new Extra1("Thread 1", n);
		t1.start();
		  
		Extra1 t2 = new Extra1("Thread 2", n);
		t2.start();
	}   
}