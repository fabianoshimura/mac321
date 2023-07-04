package model.carona;

public class ViagemConcluidaState implements ViagemState {

    @Override
    public void aceitarViagem(Carona carona) {
        // nada faz
    }

    @Override
    public void cancelarViagem(Carona carona) {
        // nada faz
    }

    @Override
    public void finalizarViagem(Carona carona) {
        // nada faz
    };

    @Override
    public String viagemStatus(Carona carona) {

        return "Viagem Concluída";
    }

}
