
public class exercicio4 {
    public void gerarExcessao() {
        try {
            throw new ArithmeticException ("Dividiu por zero");
        }
        catch (ArithmeticException e) {
            throw e;
        }
    }

    public static void main (String[] args) {
        exercicio4 obj = new exercicio4();

        try {
            obj.gerarExcessao();	
        }
        catch (ArithmeticException e) {
            System.out.println("Ocorreu ArithmeticException!");
        }
    }
}
