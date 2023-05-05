/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

public class TestaVeiculos {
    public static void main(String [] argc) {
        Veiculo []v = new Veiculo[5]; 
        v[0]=new Carro();
        v[1]=new Aviao();
        v[2]=new TecoTeco();
        v[3]=new Aviao();
        v[4]=new TecoTeco();

        Veiculo teste = new Veiculo();  // Aparece a mensagem de erro "Cannot instantiate the type Veiculo", pois "Veiculo" é uma classe abstrata. 

        for(int i=0; i<5; i++) {
            System.out.print("O veiculo "+i+" se move: ");
            v[i].move();
            v[i].set(i);
            System.out.println("Seu preço é: " + (v[i].get()+10) + "\n"); // aqui é chamado ambos os métodos não abstratos da classe
                                                                          // abstrata.
        }
    }
}
