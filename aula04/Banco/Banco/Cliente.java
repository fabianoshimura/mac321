class Cliente {
    static final int COMUM = 0;
    static final int ESPECIAL = 1;

    static final int MASCULINO = 0;
    static final int FEMININO = 1;

    String nome;
    int CPF;
    String dataNascimento;
    Endereço endereço;
    int gênero;
    int tipo;
     
    public Cliente(String nome, int CPF, String dataNascimento, Endereço endereço, int gênero, int tipo) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.endereço = endereço;
        this.gênero = gênero;
        this.tipo = tipo;
    }

    public String toString() {
        String res = "-- Cliente ---------------------";
        res += "\nNOME: " + nome;
        res += "\nCPF: " + CPF;
        res += "\nData de nascimento: " + dataNascimento;
        res += "\nEndereço: " + endereço;
        res += "\nGênero: " + (gênero==Cliente.MASCULINO?"M":"F");
        if (tipo == Cliente.ESPECIAL) res += "\n*** ESPECIAL";
        return res;
    }

}