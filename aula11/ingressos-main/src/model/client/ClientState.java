package model.client;

public interface ClientState {
    public void subscribe(Client client);
    public void unsubscribe(Client client);
    public String subscriptionStatus(Client client);
}
