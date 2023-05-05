// Conta Poupança
class ContaPoupança extends Conta {
    static final double TAXA_SAQUE = 5.0;
    static final double TAXA_TRANSF = 1.0;
    static final double TAXA_DEPO = 0.0;

    public ContaPoupança(Cliente titular, int agência, int número) {
        super(new Cliente[1], agência, número);
        this.titulares[0] = titular;
    }   

    public boolean validar() {
        return (titulares.length == 1);
    }

    public String toString() {
        return "CONTA POUPANÇA" + super.toString();
    }

    boolean transferir(double valor, Conta para) {
        // Conta poupança só permite transferência para mesma titularidade
        if (titulares[0].CPF != para.titulares[0].CPF) return false;
        return super.transferir(valor, para);
    }

}
