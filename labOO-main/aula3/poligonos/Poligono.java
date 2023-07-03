package aula3.poligonos;

class Poligono {
    int[] lados;
    String nome;

    public Poligono(int[] lados, String nome) {
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
