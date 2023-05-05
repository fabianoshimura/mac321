class Conta {
    static final int CORRENTE_IND = 0;
    static final int CORRENTE_CONJ = 1;
    static final int POUPANÇA = 2;    
    static final int CORRENTE_PREF = 3;

    static final double TAXA_SAQUE_COMUM = 10.0;
    static final double TAXA_SAQUE_PREF = 1.5;
    static final double TAXA_SAQUE_POUPANÇA = 5.0;

    static final double TAXA_TRANSF_COMUM = 2.0;
    static final double TAXA_TRANSF_PREF = 0.0;
    static final double TAXA_TRANSF_POUPANÇA = 1.0;

    static final double LIMITE_MIN_SALDO_PREF = 50000;

    Cliente[] titulares;
    int agência;
    int número;
    int tipo;
    double saldo = 0;

    public Conta(Cliente[] titulares, int agência, int número, int tipo) {
        this.titulares = titulares;
        this.agência = agência;
        this.número = número;
        this.tipo = tipo;
    }

    /** Verifica se conta é válida (de acordo com regras de contas do banco)
     * @return true, se conta for válida, false, caso contrário
     */
    public boolean validar() {
        switch(tipo) {
            case CORRENTE_IND:
            case POUPANÇA:
                return (titulares.length == 1);
            case CORRENTE_CONJ:
                return (titulares.length > 1);
            case CORRENTE_PREF:
                return (titulares.length == 1 && titulares[0].tipo == Cliente.ESPECIAL);
            default:
                return false;
        }        
    }
    
    public String toString() {
        String res = "CONTA ";
        switch(tipo) {
            case CORRENTE_IND:
                res += "CORRENTE INDIVIDUAL";
                break;
            case CORRENTE_CONJ:
                res += "CORRENTE CONJ";
                break;
            case POUPANÇA:
                res += "POUPANÇA";
                break;
            case CORRENTE_PREF:
                res += "CORRENTE PREFERENCIAL";
                break;
            default:
                res += "TIPO DESCONHECIDO";
        }
        res += "\nAGÊNCIA: " + agência;
        res += "\nNÚMERO: " + número;
        res += (titulares.length > 1 ? "\nTITULARES:\n" : "\nTITULAR: ");
        for (Cliente titular: titulares) res += titular.nome + "\n";
        return res;
    }

    boolean depositar(double valor) {
        saldo += valor;
        return true;
    }

    boolean sacar(double valor) {
        double taxa = calcularTaxaSaque();          
        if (valor + taxa > saldo) return false;
        saldo -= (valor+taxa);
        return true;
    }

    private double calcularTaxaSaque() {
        double taxa = 0;
        switch (tipo) {
            case Conta.CORRENTE_IND:
            case Conta.CORRENTE_CONJ:
                taxa += Conta.TAXA_SAQUE_COMUM;
                break;
            case Conta.CORRENTE_PREF:
                if (saldo > Conta.LIMITE_MIN_SALDO_PREF) taxa += Conta.TAXA_SAQUE_PREF;
                else taxa += Conta.TAXA_SAQUE_COMUM;
                break;
            case Conta.POUPANÇA:
                taxa += Conta.TAXA_SAQUE_POUPANÇA;
                break;
        }
        return taxa;
    }

    boolean transferir(double valor, Conta para) {
        if (valor > saldo) return false;
        if (tipo == Conta.POUPANÇA) {
            // Conta poupança só permite transferência para mesma titularidade
            if (titulares[0].CPF != para.titulares[0].CPF) return false;
            return true;
        }
        saldo -= valor;
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
