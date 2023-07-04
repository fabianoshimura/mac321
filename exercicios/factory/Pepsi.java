public class Pepsi implements Refrigerante {

    @Override
    public String getType() {
        return "Pepsi Cola";
    }

    @Override
    public String slogan() {
        return "Serve Pepsi?";
    }

    @Override
    public Pepsi clone() {
        return new Pepsi();
    }

}
