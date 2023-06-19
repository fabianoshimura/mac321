

import java.util.HashMap;

public class ConversorFactoryWithPrototype {
    private static HashMap<Integer, Conversor> conversor = new HashMap<>();

    public ConversorFactoryWithPrototype() {
        conversor.put(2, new ConversorFarenheitParaCelsius());
        conversor.put(3, new ConversorCelsiusParaFarenheit());
    }
        public Conversor newConversor(int tipo) {
        return conversor.get(tipo).clone();
    }
}
