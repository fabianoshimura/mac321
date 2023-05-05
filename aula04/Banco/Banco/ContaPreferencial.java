// Conta Preferencial Individual
class ContaPreferencial extends Conta {
    static final double TAXA_SAQUE = 1.5;
    static final double TAXA_TRANSF = 0.0;
    static final double TAXA_DEPO = 0.0;
    static final double LIMITE_MIN_SALDO = 50_000;

    public ContaPreferencial(Cliente titular, int agência, int número) {
        super(new Cliente[1], agência, número);
        this.titulares[0] = titular;
    }   

    public boolean validar() {
        return (titulares.length == 1 && titulares[0].tipo == Cliente.ESPECIAL);
    }

    public double calcularTaxaSaque() {
        if (saldo < LIMITE_MIN_SALDO) return ContaComum.TAXA_SAQUE;
        return TAXA_SAQUE;
    }

    public double calcularTaxaTransf() {
        if (saldo < LIMITE_MIN_SALDO) return ContaComum.TAXA_SAQUE;
        return TAXA_SAQUE;
    }

    public String toString() {
        return "CONTA CORRENTE PREFERENCIAL" + super.toString();
    }

}
