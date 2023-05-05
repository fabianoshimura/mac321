package exercicio9;

public class Exercicio9 extends Base {
    public void metodo() {
        System.out.println("Método");
    }

    public static void metodo2(Base x) {
        //((Exercicio9)x).metodo();   // essa linha faz o código funcionar com a classe abstrata "Base" sem conter nenhum método.
        x.metodo();     // o downcast não é mais necessário porque, agora, há um método abstrato metodo() declarado
                        // na classe abstrata "Base".
    }

    public static void main(String[] argc) {
        Exercicio9 teste = new Exercicio9();

        teste.metodo2(teste);
    }
}