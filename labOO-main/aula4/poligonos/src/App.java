package aula4.poligonos.src;
//import poligonos.*;

public class App {
    public static void main(String[] args) {
        // Cria pentágono regular de lado 4cm
        Poligonos pentágono = new Poligonos(5, 4, "pentágono");
        // pentágono._tipo = "pentágono"; // Gera erro de acesso
        System.out.println(pentágono);
        System.out.println("Perímetro do pentágono: " + pentágono.calculaPerímetro());
        Retangulo retângulo = new Retangulo(3, 4);
        System.out.println(retângulo);
        System.out.println("Área do retângulo: " + retângulo.calculaÁrea());
        retângulo._lados[0] = 10; 
        // não gera erro de acesso pois _lados é protected -> para funcionaar ele deve estar no mesmo pacote/ pasta que o arquivo/ package
        // note que isso viola a modularidade do código
        System.out.println("Área do retângulo: " + retângulo.calculaÁrea());

        if (pentágono.éCompatívelCom(retângulo)) 
          System.out.println("Pentágono e retângulo são compatíveis");
        else
          System.out.println("Pentágono e retângulo não são compatíveis");

        Retangulo quadrado = new Retangulo(5);
        System.out.println(quadrado);
        System.out.println("Área do quadrado: " + quadrado.calculaÁrea());

        System.out.println("Foram criados " + Poligonos.quantosPoligonos() + " poligonoss");

        if (Poligonos.sãoCompatíveis(quadrado, retângulo)) 
          System.out.println("Quadrado e retângulo são compatíveis");
        else
          System.out.println("Quadrado e retângulo não são compatíveis");


        
        // -------------- TRIANGULO ------------------
        Triangulo um = new Triangulo(4); //equilatero
        Triangulo dois = new Triangulo(2, 1); // isosceles
        int[] lados = {3, 4, 5};
        Triangulo tres = new Triangulo(lados); // todos diferentes

        System.out.println(um);
        System.out.println(um.ehValido());
        um.setCor("rosa");
        System.out.println(um.getCor());
        System.out.println(um.getLados());

        System.out.println(dois);
        System.out.println(dois.ehValido());
        dois.setCor("azul");
        System.out.println(dois.getCor());
        System.out.println(dois.getLados());

        System.out.println(tres);
        System.out.println(tres.ehValido());
        tres.setCor("roxo");
        System.out.println(tres.getCor());
        System.out.println(tres.getLados());
    }
}
