package aula3.poligonos;

class Triangulo extends Poligono {
    static int no_triângulos = 0;
    
    public Triangulo(int lado1, int lado2, int lado3) {
        super(new int[3], "Triângulo ");
        lados[0] = lado1; lados[1] = lado2; lados[2] = lado3;
        Triangulo.no_triângulos += 1;
        nome += Triangulo.no_triângulos;
    }
}
