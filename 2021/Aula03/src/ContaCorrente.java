
public class ContaCorrente {
	private int numConta;
    private String titular;
    private double saldo = 0;
    private static int proximoNumero = 0;
    public ContaCorrente(String titular) {
        numConta = proximoNumero++;
        this.titular = titular;
    }

    // Métodos: 
    public int pegaNumero() { 
        return numConta; 
    }
    public String pegaTitular() {
        return titular;
    }
    public double pegaSaldo() {
        return saldo;
    }
    public void deposito(double valor) {
        if (valor >= 0 ) 
            saldo = saldo + valor;
        else
            // Isto é provisório (pode ser melhorado)
            throw new RuntimeException("Depósito inválido com valor negativo"); 
    }
    public void saque(double valor) {
        if (saldo >= valor) 
            saldo = saldo - valor;
        else
            // Isto é provisório (pode ser melhorado)
            throw new RuntimeException("saldo insuficiente"); 
    }
    public void imprime() {
        System.out.println("numero: " + numConta);
        System.out.println("titular: " + titular);
        System.out.println("saldo: " + saldo);
    }
    
    public static void main( String[] args ) {
    	ContaCorrente cc = new ContaCorrente("Fulano");
    	cc.deposito(5000.00);
    	cc.imprime();
    	cc.saque(2550.50);
    	System.out.println("Novo saldo: " + cc.pegaSaldo()); 
    	
    	//cc.deposito(-100);
    }
    
}
