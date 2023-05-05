package exercicio2;

import java.io.*;

public class Exercicio2 {
    public static void main (String[] args) throws IOException {
        int n = 100000;
        PrintWriter writer = new PrintWriter("output2.txt", "UTF-8");
        Chronometer c = new Chronometer();

        c.start();
        for (int i = 0; i < n; i++) {
            writer.println("Hello World!");
        }
        c.stop();
        writer.println("Tempo decorrido para imprimir \"Hello World!\" 100000 vezes: " + c.getSeconds() + " segundos.");

        c.start();
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World!");
        }
        c.stop();
        System.out.println("Tempo decorrido para imprimir \"Hello World!\" 100000 vezes: " + c.getSeconds() + " segundos.");

        writer.close();
    }

    /*
     *  	Rodando este codigo, percebemos que impirmir um texto num arquivo eh muito mais rapido do que imprimi-lo na saida do terminal, 
     *  e essa diferenca tende a se alargar conforme aumenta-se o numero de interacoes n.
     *  	Isto ocorre devido a diferença de operações que cada processo faz. Imprimir um texto na saída do terminal é muito mais dependente
     *  do sistema operacional que imprimi-lo em um arquivo de texto. Além disso, para imprimir o texto na saída do terminal aciona algum
     *  hardware que faça comunicação com o usuário (um monitor de computador, por exemplo) e isso requer um caminho muito maior do que uma 
     *  alteração na memória (escrever em um arquivo de texto), daí sua dependência do sistema operacional, que faz um link do software com
     *  a máquina.
     */
}
