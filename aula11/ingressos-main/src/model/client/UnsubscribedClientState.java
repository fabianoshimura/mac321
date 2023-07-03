package model.client;

public class UnsubscribedClientState implements ClientState {

    @Override
    public void subscribe(Client client) {
        client.setStatus(new SubscribedClientState());
    }

    @Override
    public void unsubscribe(Client client) {
        // nothing to do here
    }

    @Override
    public String subscriptionStatus(Client client) {
        return "unsubscribed";
    }

}
