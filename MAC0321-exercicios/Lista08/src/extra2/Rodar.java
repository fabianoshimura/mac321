package extra2;

import javax.swing.*;

public class Rodar {
	public void teste(int n) {
		String s = "";
		StringBuffer sb = new StringBuffer("");
		
		Extra22 t1 = new Extra22("Thread StringBuffer", sb, n);
		t1.start();
		
		Extra21 t2 = new Extra21("Thread String", s, n);
		t2.start();
	}
	
	public static void main(String[] args) {
		/*int n;
		
		System.out.println("Executando concatenações para n = 500");
		n = 500;
		String s1 = "";
		StringBuffer sb1 = new StringBuffer("");
		
		Extra21 t1 = new Extra21("Thread String 1", s1, n);
		t1.start();
		
		Extra22 t2 = new Extra22("Thread StringBuffer 1", sb1, n);
		t2.start();
		
		System.out.println();
		
		System.out.println("Executando concatenações para n = 20");
		n = 20;
		String s2 = "";
		StringBuffer sb2 = new StringBuffer("");
		
		while (t1.terminou() && t2.terminou()) {
			Extra21 t3 = new Extra21("Thread String 2", s2, n);
			t3.start();
			
			Extra22 t4 = new Extra22("Thread StringBuffer 2", sb2, n);
			t4.start();
			break;
		}
		*/
		
		Rodar r = new Rodar();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para n: "));
		r.teste(n);
	}
	
	/*
	 * Ao executar esse programa várias vezes, percebemos que o StringBuffer é realmente mais rápido que a String quando se trata de concatenação
	 * de duas strings. Ao executar o StringBuffer primeiro, como no caso do código acima, vemos que o seu Thread sempre termina antes do que Thread 
	 * da String, o que corrobora a nossa conclusão.
	 * 
	 * Ao execurar a variação que o Thread do StringBuffer é executado depois da String, vemos que, para um número baixo de concatenções, a String
	 * termina primeiro, quando esse número se eleva, o Thread do StringBuffer passa a ser executado mais rapidamente. Isso ocorre, pois a Thread que é 
	 * chamada antes tem uma vantagem em relação a outra, como visto no exercício anterior. Por isso, enquanto o número de concatenações não
	 * é suficiente para que o Thread do StringBuffer "ultrapasse" o Thread da String, esta se encerra primeiro.
	 * 
	 * Daí, concluimos que a StringBuffer é realmente mais rápida, pois ela é capaz de "ultrapassar" a String. Essa fato decorre devido à StringBuffer
	 * ser mutável, enquanto a String não. O fato da String não ser mutátel, significa que ela precisa lidar com outro objeto para que a concatenação
	 * ocorra, já a StringBuffer consegue lidar com isso com um único objeto, o qual é alterado nele mesmo.
	 */
}
