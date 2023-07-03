package vendas.src;

public abstract class Vendas {
    
    public abstract double getImposto();
    public abstract double getFrete();

    int codigo;
    String nome;
    double valor;

    Vendas(int cod, String nome, double val) {
        this.codigo = cod;
        this.nome = nome;
        this.valor = val;
    }

    public String toString() {
        return "O produto comprado foi " + nome + " cujo codigo eh " + codigo + " e valor eh " + valor;
    }
}
