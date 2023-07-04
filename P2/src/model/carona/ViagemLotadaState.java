package model.carona;

public class ViagemLotadaState implements ViagemState {

    @Override
    public void aceitarViagem(Carona carona) {
        // nada faz
    }

    @Override
    public void cancelarViagem(Carona carona) {

        carona.setStatus(new ViagemCanceladaState());
    }

    @Override
    public void finalizarViagem(Carona carona) {

        carona.setStatus(new ViagemConcluidaState());

    };

    @Override
    public String viagemStatus(Carona carona) {

        return "Viagem Lotada";
    }

}
