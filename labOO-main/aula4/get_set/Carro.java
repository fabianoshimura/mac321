package aula4.get_set;

// Subclasse -> o "extends" indica que veiculos eh a superclasse de Carros
public class Carro extends Veiculos {
    private int cilindradas;
    //private boolean airbag;

    // Método
    Carro (int rodas, String modelo, String marca, int cilindradas) {
        super(rodas, modelo, marca); // chama a superclasse
        this.cilindradas = cilindradas;
    }

    Carro(String modelo, String marca) {
        super(4, modelo,marca);
    }

    public String toString() {
        return "Carro com " + getRodas() + " rodas e com " + cilindradas + " cilindradas";
    }

    // metódo principal de entrada (do teclado), quando executar linha de comando vai executar isso
    public static void main (String args[]) {

        Carro fordBigode = new Carro(4, "bigode", "Ford", 2900);
        System.out.println ("O veiculo criado foi " + fordBigode);
    }



}
