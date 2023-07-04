public class RefriFactoryProvider {

    public static AbstractFactoryRefri getFactory (String choice) {

        if ("Refrigerante".equalsIgnoreCase(choice)){
            return new RefriFactory();
        } 
        else if ("Sabor".equalsIgnoreCase(choice)){
            return new SaborFactory();
        } 
        return null;
    }

}
