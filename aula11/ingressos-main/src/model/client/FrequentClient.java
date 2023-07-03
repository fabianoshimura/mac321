package model.client;

public class FrequentClient extends Client {

    public FrequentClient(String id, int birthDay, int birthMonth, int birthYear, String name, String address, String email, String phone) {
        super(id, birthDay, birthMonth, birthYear, name, address, email);
        setStatus(new SubscribedClientState());
    }


    
}
