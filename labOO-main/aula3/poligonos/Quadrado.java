package aula3.poligonos;

class Quadrado extends Retangulo {
    static int no_quadrados = 0;
    public Quadrado(int lado) {
        super(lado,lado);
        no_quadrados += 1;
        nome = "Quadrado " + no_quadrados;
    }

    public double calcula_perímetro() {
        return 4*lados[0];
    }
}
