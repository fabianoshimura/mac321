import java.util.ArrayList;
import java.util.List;

import model.carona.Carona;
import model.carona.Viagem;
import model.carona.ViagemState;

//O registrador gera os Casos de Uso, ou seja,
//O registrador eh responsavel pelos seguintes metodos do Sistema (ações do Cliente):
//MOTORISTA: Registrar uma viagem
//OUTRO USUARIO (passageiro): Buscar uma viagem
//MOTORISTA: Alterar o Status da Viagem
//MOTORISTA: Gerar cobrança para o passageiro
//ADMINISTRADOR: Gerar relatório (visualizar todas as viagens e  toda movimentação)

public class Registrador {

    List<Carona> caronas = new ArrayList<>();
    List<Viagem> viagens = new ArrayList<>();

    // SINGLETON abaixo (Lazy)

    static private Registrador instance = null;

    private Registrador() {
    }

    static Registrador getInstance() {
        if (instance == null) {
            instance = new Registrador();
            testeRegistrador();
        }
        return instance;
    }

    // SINGLETON acima

    // Metodos de registros
    public void registrarViagem(String localPartida, String localChegada, double preco) {
        int id = viagens.size() + 1;
        viagens.add(new Viagem("#" + id, localPartida, localChegada, preco));
    }

    public void listarViagens() {

        System.out.println("Lista de Todas as Viagens");

        for (Viagem viagem : viagens) {

            System.out.println(viagem.toString());

        }
    }

    // Metodos de busca

    public void buscarViagem(String localPartida, String localChegada) {
        // falta implementar
    }

    // Metodos mudança de status

    public void mudarStatusViagem(int id, ViagemState status) {

        System.out.println("Mudar Status da Viagem:");

        viagens.get(id).setStatus(status);

    }

    // Retorna a quantia movimentada (valor total de todas as viagens)
    public void precoViagem(int id) {

        System.out.println("Preço da Viagem:");

        double quantia = 0;

        quantia = viagens.get(id).getPrice();

        System.out.println("R$ " + quantia);
    }

    public void quantiaMovimentada() {

        System.out.println("Quantia Movimentada:");

        double quantia = 0;
        for (Viagem viagem : viagens) {
            quantia = viagem.getPrice() + quantia;
        }
        System.out.println("R$ " + quantia);
    }

    public static void testeRegistrador() {
        System.out.println("Registrador criado!");
        System.out.println(instance);
    }

}
