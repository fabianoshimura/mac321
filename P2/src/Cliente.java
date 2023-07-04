import model.carona.Viagem;
import model.carona.ViagemAceitandoState;

public class Cliente {

    public static void main(String[] args) {

        // Instancia um novo registrador. Obs: O registrador eh unico
        // Usa-se o padrão Singleton para registrador

        Registrador registrador = Registrador.getInstance();

        // MOTORISTA registra viagem
        registrador.registrarViagem("Rua do Matão", "Estação Butantã", 10);
        registrador.registrarViagem("Av, Paulista 1000", "Av. Comendador Bonfiglioli, 100", 45);

        // OUTRO USUARIO procuram por caronas

        registrador.listarViagens();

        // MOTORISTA altera o status da viagem

        registrador.mudarStatusViagem(1, null);

        // MOTORISTA mostra preco da viagem inserindo o Id da viagem
        registrador.precoViagem(1);

        // ADMINISTRADOR gera relatório completo
        registrador.listarViagens();
        registrador.quantiaMovimentada();

    }
}
