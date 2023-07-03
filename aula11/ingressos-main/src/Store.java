import java.util.ArrayList;
import java.util.List;

import model.ticketing.Order;

public class Store {
    static private Store instance = new Store(); // Singleton (early version)

    List<Order> orders = new ArrayList<>();

    private Store() {};

    static public Store getInstance() { return instance; };

    public void buyTicket(String clientId, String eventId, int quantity) {
        // TO-DO
    }


    public void listOrders() {
        int i = 1;
        for (Order order: orders) {
            System.out.println(i + " | " + order);
            i++;
        }
    }        

    public static void main(String[] args) {
        Registry registry = Registry.getInstance();
        Store store = Store.getInstance();

        registry.registerClient(1, 4, 1949, "Ana Maria Braga Maffeis", "Rua da casa da Ana Maria Braga, RJ", "anabraga@globo.com");
        registry.registerClient(30, 11, 1973, "Angélica Ksyvickis Huck", "Rua milionários, RJ", "angélica@globo.com");
        registry.registerClient(3, 9, 1971, "Luciano Grostein Huck", "Rua milionários, RJ", "huck@globo.com");
        registry.registerClient(8, 3, 2005, "Joaquim Huck", "Rua milionários, RJ", "huckfilho@gmail.com");

        registry.registerEvent("Forró do Bom", "3/7/2023", "Canto do Sabiá", 100, 30);
        registry.registerEvent("Cruzeiro do Roberto Carlos", "20/12/2023", "Navio Azurro, saindo de Santos,SP", 1300, 3500);

        System.out.println("--- CLIENTS ---");

        registry.listClients();        

        System.out.println("--- EVENTS ---");

        registry.listEvents();

        System.out.println("--- ORDERS ---");

        // Angelica buys three tickets for Roberto Carlos Cruise tour
        store.buyTicket("#2", "2", 3);

        // Ana Maria buys two tickets for Forró for herself
        store.buyTicket("#1", "1", 1);        

        store.listOrders();    
        
        System.out.println("---");        
    }
}
