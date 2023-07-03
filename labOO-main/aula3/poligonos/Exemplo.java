package aula3.poligonos;

class Exemplo {
    public static void main(String[] args) {
        Poligono triangulo = new Triangulo(6,5,5);
        Poligono triangulo_retangulo = new Triangulo(3,4,5);
        Retangulo retangulo = new Retangulo(3,4);
        Quadrado quadrado = new Quadrado(4);
        int[] lados_pent = {3,3,3,3,3};
        Poligono pentágono = new Poligono(lados_pent, "Pentágono");
        
        Poligono[] poligonos = {triangulo, triangulo_retangulo, retangulo, quadrado, pentágono};

        for (Poligono poligono: poligonos) {
            System.out.println(poligono);
            System.out.println("Perímetro: " + poligono.calcula_perímetro());
        }

        System.out.println("Área do retangulo: " + retangulo.calcula_área());
        System.out.println("Área do quadrado: " + quadrado.calcula_área());
    }    
}
