package aula5.objeto_geometrico.src;
import java.util.ArrayList;

public class Exemplo {
    
    public static void main(String[] args) throws Exception {
        Retangulo ret = new Retangulo(3,4);
        Circulo circ = new Circulo(2);

        System.out.println(circ);

        ArrayList<ObjetoGemetrico> objetos = new ArrayList<>();
        objetos.add(ret);
        objetos.add(circ);

        for(ObjetoGemetrico obj: objetos) {
            double area = obj.calculaArea();
            System.out.println("Área " + area);
        }

    }
}
