// REFATORADO
import java.util.Scanner;

class Matriz {
    int numLinhas;
    int numColunas;
    double[][] matriz;

    public Matriz(int numLinhas, int numColunas) {
        this.numLinhas = numLinhas;
        this.numColunas = numColunas;
        matriz = new double[numLinhas][numColunas];
    }

    void lê(Scanner scanner) {
        for (int i=0; i<numLinhas; i++) {
          for (int j=0; j<numColunas; j++)
            matriz[i][j] = scanner.nextDouble();
        }
    }

    void exibe() {
        for (int i=0; i<numLinhas; i++) {
          for (int j=0; j<numColunas; j++)
            System.out.print(" " + matriz[i][j]);
        System.out.println();
        }
    }

    Matriz multiplica(Matriz outra) {
        Matriz res = new Matriz(this.numLinhas, outra.numColunas);
        for (int i=0; i<this.numLinhas; i++)
            for (int j=0; j<outra.numColunas; j++)
                for (int k=0; k<this.numColunas; k++)
                   res.matriz[i][j] += this.matriz[i][k]*outra.matriz[k][j];
          return res;    
    }

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Use: programa numLinA numColA numLinB numColB");
            return;
        }
        int numLinA = Integer.parseInt(args[0]);
        int numColA = Integer.parseInt(args[1]);
        int numLinB = Integer.parseInt(args[2]);
        int numColB = Integer.parseInt(args[3]);
    
        if (numColA != numLinB) {
            System.out.println("Dimensões incompatíveis: numColA precisa igualar numLinB");
            return;
        }

        Matriz mA = new Matriz(numLinA,numColA);
        Matriz mB = new Matriz(numLinB,numColB);

        Scanner scanner = new Scanner(System.in);

        mA.lê(scanner);  mB.lê(scanner);
        mA.exibe(); mB.exibe();
    
        Matriz mC = mA.multiplica(mB);
        mC.exibe();

        scanner.close();

    }
}