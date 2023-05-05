
public class exercicio2 {
    public void gerarExcessoes(int x) {
        int m[] = null;
        int indice;

        try {
            if (x >= 10) {
                m = new int[x];
                for (int i = 10; i < 15; i++)
                        m[i] = i;
            }
            else {
                System.out.println(m[1]);
            }
        }
        catch (NullPointerException e) {
            System.out.println("Null.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Estourou o índice.");
        }

    }

    public static void main (String[] args) {
        exercicio2 obj = new exercicio2();

        obj.gerarExcessoes(12);	// na chamada desse método com este argumeto haverá estouro no índice do vetor
        obj.gerarExcessoes(5);	// já na chamada com esse argumento, há referência a um dado null.
    }
}
