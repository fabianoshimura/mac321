import java.util.ArrayList;

class Polígono {
    int[] lados;
    String nome;

    public Polígono(int[] lados, String nome) {
        this.lados = lados;
        this.nome = nome;
    }

    public double calcula_perímetro(){
        double p = 0;
        for (Integer lado: this.lados) {
            p += lado;
        }
        return p;
    }

    public String toString() {
        return "Olá, eu sou o " + nome;
    }
}