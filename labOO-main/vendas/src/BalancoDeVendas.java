package vendas.src;

public class BalancoDeVendas {

    public void printVendas(Vendas[] vendas) {
        int count = 0;
        for(Vendas v: vendas) {
            count += 1;
            System.out.println(count + " - " + v.toString());
        }
    } 

    public double valorTotImposto(Vendas[] vendas) {
        double total = 0;
        for(Vendas v: vendas) {
            total += (v.valor) * v.getImposto(); 
        }
        return total;
    }

    public double receitaLiquidaTot(Vendas[] vendas) {
        double total = 0;
        for(Vendas v: vendas) {
            total += (v.valor) - v.getImposto() - v.getFrete(); 
        }
        return total;
    }    
}
