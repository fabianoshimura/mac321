import java.util.ArrayList;
import java.util.List;

import model.client.Client;
import model.client.RegularClient;
import model.event.ConcreteEvent;
import model.event.Event;
import model.ticketing.RealTicket;
import model.ticketing.Ticket;

public class Registry {
    List<Client> clients = new ArrayList<>();
    List<Event> events = new ArrayList<>();
    List<Ticket> tickets = new ArrayList<>();

    static private Registry instance = new Registry(); // eager version implementation

    private Registry() {}; // hiding constructor to implement Singleton

    static public Registry getInstance() {
        return instance;
    }

    public void registerClient(int birthDay, int birthMonth, int birthYear, String name, String address, String email) {
        int id = clients.size()+1;
        clients.add(new RegularClient("#" + id, birthDay, birthMonth, birthYear, name, address, email));
    }

    public void registerEvent(String description, String startDate, String place, int availableTickets,
            double baseFare) {
        int id = events.size() + 1;
        events.add(new ConcreteEvent(id, description, startDate, place, availableTickets, baseFare));
    }

    // Note: This does not make a sale, it only registers a new ticket in the system
    public void registerTicket(String clientId, int eventId) {
        // Find client instance by given d
        Client theClient = null;
        for (Client client: clients) {
            if (client.getId().equals(clientId)) {
                theClient = client;
                break;
            }
        }
        // Find event instance by given id
        Event theEvent = null;
        for (Event event: events) {
            if (event.getId() == eventId) {
                theEvent = event;
                break;
            }
        }
        // If any is missing, abort        
        if (theClient == null) throw new RuntimeException("Client id " + clientId + " not found!");
        if (theEvent == null) throw new RuntimeException("Event id " + eventId + " not found!");
        // else, create new ticket
        int id = tickets.size()+1;
        Ticket ticket = new RealTicket(id, theClient, theEvent);
        tickets.add(ticket);
    }

    public void listClients() {
        int i = 1;
        for (Client client: clients) {
            System.out.println(i + " | " + client);
            i++;
        }
    }

    public void listEvents() {
        int i = 1;
        for (Event event: events) {
            System.out.println(i + " | " + event);
            i++;
        }
    }

    public void listTickets() {
        int i = 1;
        for (Ticket ticket: tickets) {
            System.out.println(i + " | " + ticket);
            i++;
        }
    }    

    public static void main(String[] args) {
        Registry registry = Registry.getInstance();

        registry.registerClient(1, 4, 1949, "Ana Maria Braga Maffeis", "Rua da casa da Ana Maria Braga, RJ", "anabraga@globo.com");
        registry.registerClient(30, 11, 1973, "Angélica Ksyvickis Huck", "Rua milionários, RJ", "angélica@globo.com");
        registry.registerClient(3, 9, 1971, "Luciano Grostein Huck", "Rua milionários, RJ", "huck@globo.com");
        registry.registerClient(8, 3, 2005, "Joaquim Huck", "Rua milionários, RJ", "huckfilho@gmail.com");

        registry.registerEvent("Forró do Bom", "3/7/2023", "Canto do Sabiá", 100, 30);
        registry.registerEvent("Cruzeiro do Roberto Carlos", "20/12/2023", "Navio Azurro, saindo de Santos,SP", 1300, 3500);

        // Angelica's family buys three tickets for Roberto Carlos Cruise tour
        registry.registerTicket("#2", 2);
        registry.registerTicket("#3", 2);
        registry.registerTicket("#4", 2);

        // Ana Maria buys two tickets for Forró for herself
        registry.registerTicket("#1", 1);

        System.out.println("--- CLIENTS ---");

        registry.listClients();        

        System.out.println("--- EVENTS ---");

        registry.listEvents();

        System.out.println("--- TICKETS ---");

        registry.listTickets();
    }
}
