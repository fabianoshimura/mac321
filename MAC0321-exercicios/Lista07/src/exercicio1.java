
public class exercicio1 {
	
    public static void main (String[] args) {
        int m[] = new int[10];
        int indice;

        try {
            indice = 11;
            m[indice] = 2;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Estorou o índice.");
            indice = 10;
        }
    }
	
}
