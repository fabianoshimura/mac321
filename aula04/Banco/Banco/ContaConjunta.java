// Conta Comum Conjunta
class ContaConjunta extends Conta {
    static final double TAXA_SAQUE = 10.0;
    static final double TAXA_TRANSF = 2.0;
    static final double TAXA_DEPO = 0.0;

    public ContaConjunta(Cliente[] ostitulares, int agência, int número) {
        super(ostitulares, agência, número);
    }   

    public boolean validar() {
        return (titulares.length > 1);
    }

    public double calcularTaxaSaque() {
        return TAXA_SAQUE;
    }

    public String toString() {
        return "CONTA CORRENTE CONJUNTA" + super.toString();
    }

}
