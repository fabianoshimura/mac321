package exercicio4;

public class Exercicio4 extends Obj2 {
    public void metodo(final Obj x) {
        Obj2 obj2 = new Obj2();
        x = obj2;   // não é possível fazer essa atribuição porque o objeto "x" é do tipo "final".
        x = null;   // também não é possível fazer essa atribuição pelo mesmo motivo acima.
    }

    public static void main(String[] args) {
        final Obj teste = new Obj();
        Exercicio4 classe = new Exercicio4();
        
        classe.metodo(teste);
    }
}
