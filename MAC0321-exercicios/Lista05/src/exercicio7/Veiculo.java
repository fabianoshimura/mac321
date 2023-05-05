/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

public abstract class Veiculo  {
    private double preco;

    public void set(double valor) {
        preco = valor;
    }

    public double get() {
        return preco;
    }

    abstract public void move();
    abstract public void tamanho();
}
