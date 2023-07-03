import java.util.Scanner;

class MultiplicaMatrizes {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Use: Exercicio 1  num_linA num_colA num_linB num_colB");
            return;
        }
        Scanner scanner = new Scanner(System.in);

        int numLinA = Integer.parseInt(args[0]);
        int numColA = Integer.parseInt(args[1]);
        int numLinB = Integer.parseInt(args[2]);
        int numColB = Integer.parseInt(args[3]);

        double [][]matrizA = new double[numLinA][numColA];
        double [][]matrizB = new double[numLinB][numColB];
        //double [][]matrizC = new double[numLinA][numColB];

        System.out.print("lendo matriz A de dimensão " + numLinA + " por " + numColA + "\n");
        double valor;
        for (int i = 0; i < numLinA; i++) {
            for (int j = 0; j < numColA; j++) {
                valor = scanner.nextDouble();
                System.out.println("A[" + i + "," + j + "] = " + valor);
                matrizA[i][j] = valor;
            }
        }

        System.out.print("lendo matriz B de dimensão " + numLinB + " por " + numColB + "\n");
        for (int i = 0; i < numLinB; i++) {
            for (int j = 0; j < numColB; j++) {
                valor = scanner.nextDouble();
                System.out.println("A[" + i + "," + j + "] = " + valor);
                matrizB[i][j] = valor;
            }
        }

        System.out.print("matrizA * matrizB\n");
        //multiplica(matrizA, matrizB, numLinA, numColB);

        double [][]matrizC = new double[numLinA][numColB];
        double sol = 0;

        for (int i = 0; i < numLinA; i++) {
            for (int j = 0; j < numColB; j++) {

                sol = 0;
                for (int k = 0; k < numLinB; k++) {
                    sol = sol + (matrizA[i][k] * matrizB[k][j]);
                }

                matrizC[i][j] = sol;
                System.out.print(matrizC[i][j] + " "); 
            }
            System.out.print("\n");
        }
        
        scanner.close();

    }
}

    //public static double[][] multiplica(double [][]matrizA, double[][]matrizB, int linA, int colB) {
    //public static void multiplica(double [][]matrizA, double[][]matrizB, int linA, int colB) {

        //double [][]matrizC = new double[linA][colB];
        //int sol = 0;

        //for (int i = 0; i < linA; i++) {
            //for (int j = 0; j < colB; j++) {

                //sol += matrizA[i][j] * matrizB[j][i];
                //matrizC[i][j] = sol;
                //System.out.print(matrizC[i][j]);
            //}
            //sol = 0;
        //}


        //return matrizC;
    //}
//}

// para rodar o programa colocando um arquivo.txt de entrada
// java nome_do_programa.java la ca lb cb < nome_do_arquivo.txt

/* COMO rodar código com entrada vinda de txt:
 * 1. abrir o debugger (play + joaninha) e criar jason file.
 * 2. add config e adicionar laung program with auguments prompt.
 * 3. copiar ultima linha do que foi criado e deletar
 * 4. colar oq foi copiado no final da ultima chave do codigo
 * 5. voltar ao codigo nomral e rodar com 
 *  java nome_arquivo.java _argumentos_ <nome_do_texto.txt
 */
