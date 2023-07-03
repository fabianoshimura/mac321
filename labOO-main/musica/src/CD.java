public class CD extends Musicas{

    CD(String t, String alb, String comp, String inter, int ano) {
        super(t, alb, comp, inter, ano);
    }
    
    public String toString() {
        return super.toString() + "\n Formato: CD";
    }
}
