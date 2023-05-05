// Conta Comum Individual
class ContaComum extends Conta {
    static final double TAXA_SAQUE = 10.0;
    static final double TAXA_TRANSF = 2.0;
    static final double TAXA_DEPO = 0.0;

    public ContaComum(Cliente titular, int agência, int número) {
        super(new Cliente[1], agência, número);
        this.titulares[0] = titular;
    }   

    public boolean validar() {
        return (titulares.length == 1);
    }

    public double calcularTaxaSaque() {
        return TAXA_SAQUE;
    }

    public String toString() {
        return "CONTA CORRENTE INDIVIDUAL" + super.toString();
    }

}
