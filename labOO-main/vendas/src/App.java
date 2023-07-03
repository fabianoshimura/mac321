package vendas.src;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Vendas[] todasVendas = new Vendas[n];

        for(int i = 0; i < n; i++) {
            int codigo = sc.nextInt();
            sc.nextLine();
            double valor = sc.nextDouble();
            sc.nextLine();
            String nome = sc.nextLine();

            todasVendas[i] = new VendasSp(codigo, nome, valor);
        }
        sc.close();
        
        BalancoDeVendas x = new BalancoDeVendas();
        x.printVendas(todasVendas);
        System.out.println(x.valorTotImposto(todasVendas));
        System.out.println(x.receitaLiquidaTot(todasVendas));   
    }
}
