class Exemplo {
    public static void main(String[] args) {
        Polígono triângulo = new Triângulo(6,5,5);
        Polígono triângulo_retângulo = new Triângulo(3,4,5);
        Retângulo retângulo = new Retângulo(3,4);
        Quadrado quadrado = new Quadrado(4);
        int[] lados_pent = {3,3,3,3,3};
        Polígono pentágono = new Polígono(lados_pent, "Pentágono");
        
        Polígono[] polígonos = {triângulo, triângulo_retângulo, retângulo, quadrado, pentágono};

        for (Polígono polígono: polígonos) {
            System.out.println(polígono);
            System.out.println("Perímetro: " + polígono.calcula_perímetro());
        }

        System.out.println("Área do retângulo: " + retângulo.calcula_área());
        System.out.println("Área do quadrado: " + quadrado.calcula_área());
    }    
}
