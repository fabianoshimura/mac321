package model.carona;

public interface ViagemState {

    public void aceitarViagem(Carona carona);

    public void cancelarViagem(Carona carona);

    public void finalizarViagem(Carona carona);

    public String viagemStatus(Carona carona);

}
