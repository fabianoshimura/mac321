package model.carona;

public class ViagemAceitandoState implements ViagemState {

    @Override
    public void aceitarViagem(Carona carona) {

        carona.setStatus(new ViagemAndamentoState());

    }

    @Override
    public void cancelarViagem(Carona carona) {
        // A viagem soh pode ser cancelada antes de ser iniciada
        carona.setStatus(new ViagemCanceladaState());

    }

    @Override
    public void finalizarViagem(Carona carona) {
        // nada faz
    };

    @Override
    public String viagemStatus(Carona carona) {

        return "Viagem aceitando passageiros";
    }

}
