
public class ClienteRefri {

    public static void main(String[] args) {
        System.out.println("Início do programa");

        AbstractFactoryRefri abstractFactoryRefri;

        abstractFactoryRefri = RefriFactoryProvider.getFactory("Refrigerante");
        Refrigerante refrigerante = (Refrigerante) abstractFactoryRefri.create("Coca");

        abstractFactoryRefri = RefriFactoryProvider.getFactory("Sabor");
        Sabor sabor = (Sabor) abstractFactoryRefri.create("Diet");

        System.out.println(refrigerante.getType());
        System.out.println(refrigerante.slogan());

        System.out.println(sabor.getType());
        System.out.println(sabor.slogan());

    }
}
