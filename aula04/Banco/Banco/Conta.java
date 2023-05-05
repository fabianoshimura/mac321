class Conta {
    static final double TAXA_SAQUE = 0.0;
    static final double TAXA_TRANSF = 0.0;
    static final double TAXA_DEPO = 0.0;

    Cliente[] titulares;
    int agência;
    int número;

    double saldo = 0;

    public Conta(Cliente[] titulares, int agência, int número) {
        this.titulares = titulares;
        this.agência = agência;
        this.número = número;
    }

    /** Verifica se conta é válida (de acordo com regras de contas do banco)
     * @return true, se conta for válida, false, caso contrário
     */
    public boolean validar() {
        return false;
    }
    
    public String toString() {
        String res = "";
        res += "\nAGÊNCIA: " + agência;
        res += "\nNÚMERO: " + número;
        res += (titulares.length > 1 ? "\nTITULARES:\n" : "\nTITULAR: ");
        for (Cliente titular: titulares) res += titular.nome + "\n";
        return res;
    }

    boolean depositar(double valor) {
        double taxa = calcularTaxaDepo();
        saldo += (valor-taxa);
        return true;
    }

    boolean sacar(double valor) {
        double taxa = calcularTaxaSaque();          
        if (valor + taxa > saldo) return false;
        saldo -= (valor+taxa);
        return true;
    }

    public double calcularTaxaSaque() {
        return TAXA_SAQUE;
    }

    public double calcularTaxaTransf() {
        return TAXA_TRANSF;
    }

    public double calcularTaxaDepo() {
        return TAXA_TRANSF;
    }

    boolean transferir(double valor, Conta para) {
        double taxa = calcularTaxaTransf();          
        if (valor + taxa > saldo) return false;
        saldo -= (valor+taxa);
        para.saldo += valor;
        return true;
    }

    void tirarExtrato() {
        System.out.println("-- EXTRATO -----------------");
        System.out.println(this);
        System.out.println("SALDO: R$" + saldo);
        System.out.println("----------------------------");
    }
}
