public class Diet implements Sabor {

    @Override
    public String getType() {
        return "Diet";
    }

    @Override
    public String slogan() {
        return "Sem açúcar!";
    }

    @Override
    public Sabor clone() {
        return new Diet();
    }

}
