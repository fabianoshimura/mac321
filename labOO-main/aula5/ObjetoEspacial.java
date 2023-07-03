package aula5;

public interface ObjetoEspacial {
    int k = 42;

    int getPosicaoX();
    int getPosicaoy();

    void setPosicaoX();
    void setPosicaoy();

    void exploda(int intencidade);
    boolean colideCom(ObjetoEspacial oe);
    //MP3 suaMusica();
    String nome();
    String descricao();

}
