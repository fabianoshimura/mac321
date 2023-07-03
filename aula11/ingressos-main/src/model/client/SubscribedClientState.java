package model.client;

public class SubscribedClientState implements ClientState {

    @Override
    public void subscribe(Client client) {
        // nothing to do here -- maybe could throw an exception in case
        // some one is double charged for subscription
    }

    @Override
    public void unsubscribe(Client client) {
        client.setStatus(new UnsubscribedClientState());
    }

    @Override
    public String subscriptionStatus(Client client) {
        return "subscribed";
    }
    
}
