import java.util.Scanner; 

public class AppConversor {
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
        if (unidadeEntrada == unidadeSaída) {
            conv = new ConversorIdentidade();
        } else if (unidadeEntrada == 'C' && unidadeSaída == 'F') {
            conv = new ConversorCelsiusParaFarenheit();
        } else if (unidadeEntrada == 'F' && unidadeSaída == 'C') {
            conv = new ConversorFarenheitParaCelsius();
        } else {
            throw new UnsupportedOperationException("Unimplemented method 'converte'");
        }
        double tempSaída = conv.converte(tempEntrada);
        System.out.printf("%.2f%c -> %.2f%c\n", tempEntrada, unidadeEntrada, tempSaída, unidadeSaída);
    }
}
