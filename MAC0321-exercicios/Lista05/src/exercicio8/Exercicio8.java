package exercicio8;

public class Exercicio8 extends Base {
    public void metodo2() {
        System.out.println("Método2 da classe derivada");
    }

    public static void main(String[] argc) {
        Exercicio8 teste = new Exercicio8();
        teste.metodo1();
    }
}

/*
 * Ao se chamar o primeiro método num objeto da classe derivada, este chama o metodo1(), que por sua vez,
 * chama o metodo2(), mas da classe derivada e não da classe base, pois o objeto que chamou o primeiro método
 * inicialmente pertence à classe derivada.
 */
