package exercicio2;

public class Exercicio2 {
    
    public static final int membro1 = 1;
    public final int membro2 = 2;
  
    public static void main(String[] args) {
        System.out.println(membro1);
        membro1 = 2;                    //  essa atribuição não é aceita porque não se pode alterar o valor de uma variável static final.
        System.out.println(membro2);    //  a variável "membro2" não pode ser chamada dentro do método "main" pois este é do tipo static enquanto que a variável, não.
        Exercicio2 lista = new Exercicio2();
        lista.imprimirMembro2();
    }
    
    public void imprimirMembro2() { // este método consegue usar "membro2" pois este não é do tipo static.
        System.out.println(membro2);
    }
}