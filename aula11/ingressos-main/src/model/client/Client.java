package model.client;

public abstract class Client {

    private String id;
    private int[] birthDate = new int[3];
    private String name;
    private String address;
    private String email;
    private ClientState subscriptionStatus = new UnsubscribedClientState();

    public Client(String id, int birthDay, int birthMonth, int birthYear, String name, String address, String email) {
        this.id = id;
        this.birthDate[0] = birthDay;
        this.birthDate[1] = birthMonth;
        this.birthDate[2] = birthYear;
        this.name = name;
        this.address = address;
        this.email = email;
    };

    public void setStatus(ClientState status) {
        subscriptionStatus = status;
    }

    public ClientState getStatus() {
        return subscriptionStatus;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getBirthDate() {
        return birthDate[0] + "/" + birthDate[1] + "/" + birthDate[2];
    }
    public void setBirthDate(int day, int month, int year) {
        this.birthDate[0] = day;
        this.birthDate[1] = month;
        this.birthDate[2] = year;
    }
    public int getAge() { // Simplified
        return 2023 - birthDate[2];
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ", " + getAge() + " years" + " [id=" + id + ", address="
                + address + ", email=" + email + "]";
    }  
    
}