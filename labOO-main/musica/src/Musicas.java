public class Musicas {

    public String titulo;
    public String album;
    public String compositor;
    public String interprete;
    public int ano;

    Musicas (String t, String alb, String comp, String inter, int ano) {
        this.titulo = t;
        this.album = alb;
        this.compositor = comp;
        this.interprete = inter;
        this.ano = ano;
    }

    public String toString() {
        String res = "\n--------------";
        res += "\n Titulo: "  + titulo;
        res += "\n Album: " + album;
        res += "\n Compositor: " + compositor;
        res += "\n Interprete: " + interprete;
        res += "\n Ano: " + ano;
        return res;
    }
}
