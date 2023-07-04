import java.util.HashMap;

public class SaborFactory implements AbstractFactoryRefri<Sabor> {

    HashMap<String, Sabor> prototipoDeSabor = new HashMap<>();

    SaborFactory() {
        prototipoDeSabor.put("Diet", new Diet());
        prototipoDeSabor.put("Normal", new Normal());
    }

    @Override
    public Sabor create(String type) {
        return prototipoDeSabor.get(type).clone();
    }

}
