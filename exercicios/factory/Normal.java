public class Normal implements Sabor {

    @Override
    public String getType() {
        return "Tradicional";
    }

    @Override
    public String slogan() {
        return "Muito mais gostoso!";
    }

    @Override
    public Sabor clone() {
        return new Normal();
    }
}
