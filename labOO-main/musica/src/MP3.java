public class MP3 extends Musicas {

    private int tamanho;

    MP3(String t, String alb, String comp, String inter, int ano, int tamanho) {
        super(t, alb, comp, inter, ano);
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Tamanho: "  + tamanho + " bytes"
                                + "\n Formato: MP3";
    }
    
}
