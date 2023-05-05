
public class exercicio5 {
    // modifiquei o programa que calcula o fatorial de um número.

    public int fatorial (int n) throws FatorialNegativoException {
        int resultado = n;

        try {
            if (n < 0) throw new FatorialNegativoException ("Fatorial Negativo!");
        }
        catch (FatorialNegativoException e) {
            System.out.println("Não existe fatorial de números negativos!");
            throw e;
        }
        finally {
            n--;
            while (n > 0) {
                resultado *= n;
                n--;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        exercicio5 teste = new exercicio5();
        int res;
        
        try {
            res = teste.fatorial(-2);
            System.out.println("!-2 = " + res);
        }
        catch (FatorialNegativoException e) {
           System.out.println("!-2 = não existe");
        }
        
        try {
           res = teste.fatorial(4);
           System.out.println("!4 = " + res);
        }
        catch (FatorialNegativoException e){
            System.out.println("!4 = não existe.");
        }
    }
}
