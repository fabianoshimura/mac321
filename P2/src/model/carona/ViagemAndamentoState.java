package model.carona;

public class ViagemAndamentoState implements ViagemState {

    @Override
    public void aceitarViagem(Carona carona) {
        // nada faz

    }

    @Override
    public void cancelarViagem(Carona carona) {

        // A viagem não pode ser cancelada em Andamento!
        // carona.setStatus(new ViagemCanceladaState());
    }

    @Override
    public void finalizarViagem(Carona carona) {

        carona.setStatus(new ViagemConcluidaState());
    };

    @Override
    public String viagemStatus(Carona carona) {

        return "Viagem em andamento";
    }

}
