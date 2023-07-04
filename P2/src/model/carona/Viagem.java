package model.carona;

//Viagem eh uma carona real,ou seja
//Carona eh um objeto com seus atributos mas eh abstrato
//Viagem eh o pedido da carona, uma carona concreta

public class Viagem extends Carona {

    // Definindo o construtor
    public Viagem(String id, String localPartida, String localChegada, double preco) {
        super(id, localPartida, localChegada, preco);

    }

    // @Override
    // public String toString() {
    // return null;
    // }
}