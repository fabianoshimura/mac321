import java.util.Scanner;

public class ConversorClient {
    public static void main(String[] args) {
        Conversor conv; // Criaremos um conversor dependento das entradas e saídas.
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a unidade da temperatura a ser convertida [F ou C]: ");
        char unidadeEntrada = sc.next().charAt(0);   
        System.out.print("Digite para qual unidade da temperatura convertê-la [F ou C]: ");
        char unidadeSaída = sc.next().charAt(0);   
        System.out.print("Digite a temperatura de entrada (em " + unidadeEntrada + "): ");
        double tempEntrada = sc.nextDouble();
        sc.close();


        //CRIANDO A FABRICA DE CONVERSORES

        //ConversorFactory factory = new ConversorFactory();

        ConversorFactoryWithPrototype factory = new ConversorFactoryWithPrototype();

        int tipo = 0;
        if (unidadeEntrada == 'F' && unidadeSaída == 'C')tipo = 2;
        if (unidadeEntrada == 'C' && unidadeSaída == 'F')tipo = 3;

        conv = factory.newConversor(tipo);

        double tempSaída = conv.converte(tempEntrada);
        System.out.printf("%.2f%c -> %.2f%c\n", tempEntrada, unidadeEntrada, tempSaída, unidadeSaída);

        System.out.println("Fim do exercicio");     
    }
    
}
