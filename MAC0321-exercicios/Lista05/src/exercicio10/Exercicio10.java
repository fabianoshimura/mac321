package exercicio10;

public class Exercicio10 extends Base implements Classe {
    public void metodoInterface() {
        System.out.println("Método Interface");
    }

    public static void main(String[] args) {
        Exercicio10 teste = new Exercicio10();
        
        teste.metodoBase();
        teste.metodoInterface();
    }
}

/* 
 * Sim, em Java é possível fazer isso, derivando uma classe de outra classe base e implementando uma classe
 * de interface.
 */