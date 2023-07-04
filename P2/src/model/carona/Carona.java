package model.carona;

//Uma carona eh uma abstracao de viagem
//Viagem eh um pedido de carona
//PADRAO ESTRATEGIA

public abstract class Carona {

    private String id;
    private String localPartida;
    private String localChegada;
    private double preco;

    // Aqui quando instancia uma viagem ela inicia no estado ViagemAceitandoState
    private ViagemState status = new ViagemAceitandoState();

    // construtor

    public Carona(String id, String localPartida, String localChegada, double preco) {
        this.id = id;
        this.localPartida = localPartida;
        this.localChegada = localChegada;
        this.preco = preco;
    }

    public void setStatus(ViagemState currentStatus) {
        status = currentStatus;
    }

    public String getId() {
        return id;
    }

    public void getStatus() {
        System.out.println(status);
    }

    // @Override
    public String toString() {
        return id + ", " + localPartida + ", " + localChegada + ", " + preco + ", " + status;
    };

    // Mostra o valor cobrado, somente se a viagem foi concluída.Falta implementar.
    public double getPrice() {

        return preco;

        // if (status != null) {
        // return preco;
        // } else {
        // System.out.println("Viagem ainda em andamento");
        // }
        // return 0;

    }

}
