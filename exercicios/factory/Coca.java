
public class Coca implements Refrigerante {

    @Override
    public String getType() {
        return "Coca cola!";
    }

    @Override
    public String slogan() {
        return "Taste the Feeling!";
    }

    @Override
    public Coca clone() {
        return new Coca();
    }

}
