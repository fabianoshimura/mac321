import java.util.HashMap;

public class RefriFactory implements AbstractFactoryRefri<Refrigerante> {

    HashMap<String, Refrigerante> prototipoDeRefri = new HashMap<>();

    RefriFactory() {
        prototipoDeRefri.put("Coca", new Coca());
        prototipoDeRefri.put("Pepsi", new Pepsi());
    }

    @Override
    public Refrigerante create(String refriType) {
        return prototipoDeRefri.get(refriType).clone();
    }

}
