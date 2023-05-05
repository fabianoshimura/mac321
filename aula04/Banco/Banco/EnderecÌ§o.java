class Endereço {
    String logradouro;
    int número;
    String complemento;
    String CEP;
    String cidade;
    String estado;
    String país;
    
    public Endereço(String logradouro, int número, String complemento, String CEP, String cidade, String estado,
            String país) {
        this.logradouro = logradouro;
        this.número = número;
        this.complemento = complemento;
        this.CEP = CEP;
        this.cidade = cidade;
        this.estado = estado;
        this.país = país;
    }    

    public String toString() {
        return this.logradouro + ", " + this.número + " " + this.complemento + 
        " CEP " + this.CEP + " " + this.cidade + ", " + this.estado + " - " + this.país;
    }
}
