import java.util.ArrayList;

public class Busca {
    
    public void buscaAnos90(ArrayList<Musicas> todasMusicas) {
        System.out.println("\n------- lista de musicas dos anos 90 -------");
        for(Musicas m: todasMusicas) {
            if (m.ano >= 1990 && m.ano < 2000) System.out.println(m);
        }
    }

    public void buscaTitulo(ArrayList<Musicas> todasMusicas, String titulo) {
        System.out.println("\n------- musicas com o titulo " + titulo + " -------");
        for(Musicas m: todasMusicas) {
            if (m.titulo == titulo) System.out.println(m);
        }
    }

    public void buscaCompositor(ArrayList<Musicas> todasMusicas, String compositor) {
        System.out.println("\n------- musicas do compositor " + compositor + " -------");
        for(Musicas m: todasMusicas) {
            if (m.compositor == compositor) System.out.println(m);
        }
    }

    public void buscaInterprete(ArrayList<Musicas> todasMusicas, String interprete) {
        System.out.println("\n------- musicas do interprete " + interprete + " -------");
        for(Musicas m: todasMusicas) {
            if (m.interprete == interprete) System.out.println(m);
        }
    }
}
