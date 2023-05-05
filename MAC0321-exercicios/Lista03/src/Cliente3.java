public class Cliente3 {
    private String cliente;
    private int num_conta;
    private static int gerador = 1000;
    private double saldo;
    private boolean bloqueado = true;
    private static int qtd_bloqueados = 0;
    private static int qtd_contas = 0;
    
    public void gerarConta () {
        gerador += 1;
        num_conta = gerador;
    }

    public void finalize() {
        qtd_contas--;
        this.cliente = null;
        this.num_conta = -1;
        this.saldo = -1;
        this.bloqueado = true;
    }

    private Cliente3 (String nome_cliente) {
        if (qtd_contas < 5) {
            cliente = nome_cliente;
            bloqueado = false;
            qtd_contas++;
        }
    }

    private Cliente3 (String nome_cliente, double qtd_saldo) {
        if (qtd_contas < 5) {
            cliente = nome_cliente;
            saldo = qtd_saldo;
            bloqueado = false;
            qtd_contas++;
        }
    }
    
    public static Cliente3 criarCliente(String nome_cliente, double qtd_saldo) {
        Cliente3 cliente = new Cliente3(nome_cliente, qtd_saldo);
       
        return cliente;
    }

    public int saque (double valor) {
        if (!bloqueado) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Operacao realizada com sucesso!");
                return 1;
            }
            else {
                System.out.println("Nao ha saldo suficiente para este saque");
                return 0;
            }
        }
        System.out.println("Conta bloqueada");
        return 0;
    }

    public int deposito(double valor) {
        if (!bloqueado) {
            saldo += valor;
            return 1;
        }
        return 0;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + cliente);
        System.out.println("Num. conta: " + num_conta);
        System.out.println("Saldo disponivel: " + saldo);
        if (bloqueado) 
            System.out.println("Estado da conta: bloqueada\n");
        else
            System.out.println("Estado da conta: ativa\n");
    }

    public boolean saldoDisponivelEhMaior (double valor) {
        if (saldo >= valor)
            return true;
        else 
            return false;
    }

    public boolean verificaNome (String nome) {
        if (cliente.matches(nome))
            return true;
        else
            return false;
    }

    public void bloquear() {
        if (saldo < 0) {
            bloqueado = true;
            qtd_bloqueados += 1;
        }
        else
            bloqueado = false;
    }

    public static void main(String[] args) {
        Cliente3 teste = criarCliente("teste", 100);
        Cliente3 teste2 = criarCliente("teste2", 100);
        Cliente3 teste3 = criarCliente("teste3", 100);
        Cliente3 teste4 = criarCliente("teste4", 100);
        Cliente3 teste5 = criarCliente("teste5", 100);
        Cliente3 teste6 = criarCliente("teste6", 100);
        
        teste.imprimeDados();
        teste2.imprimeDados();
        teste3.imprimeDados();
        teste4.imprimeDados();
        teste5.imprimeDados();
        teste6.imprimeDados();
        
        teste.finalize();
        
        Cliente3 teste7 = criarCliente("teste7", 100);
        teste7.imprimeDados();
        teste.imprimeDados();
    }
}
