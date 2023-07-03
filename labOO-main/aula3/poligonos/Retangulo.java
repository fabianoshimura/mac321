package aula3.poligonos;

class Retangulo extends Poligono {
    static int no_retângulos;
    public Retangulo(int largura, int comprimento) {
        super(new int[4], "Retângulo ");
        no_retângulos += 1;
        nome += no_retângulos;
        lados[0] = lados[2] = largura;
        lados[1] = lados[3] = comprimento;
    }    

    public double calcula_perímetro() {
        return 2*(lados[0]+lados[1]);
    }

    public double calcula_área() {
        return lados[0]*lados[1];
    }
}
