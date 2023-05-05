public class Polígono {
    protected int[] _lados; // trocar por acesso private faz com que 
                            // subclasses não possam acessar atributo diretamente

    private String _tipo;   // trocar por protected, expõe atributo para outras classes
                            // no mesmo pacote, violando encapsulamento

    private String _unidade = "cm"; // unidade de medida

    private static final String id = "001"; // não pode ser alterado
    private static int _no_polígonos = 0;

    // Cria um polígono com array de lados e descrição de tipo.
    // Se construtor não for public, não podemos criar novo objeto 
    // (usaremos isso mais para a frente)
    public Polígono(int[] lados, String tipo) {
        _lados = lados;
        _tipo = tipo;
        _no_polígonos += 1; // incrementa total de objetos dessa classe (ou subclasses) criados
    }

    public Polígono(int[] lados) {
        this(lados, "polígono"); // chama construtor acima
    }

    // Cria polígono regular com dado descrição tipo (num_lados > 0)
    public Polígono(int num_lados, int tam_lado, String tipo) {
        this(new int[num_lados]); // chama construtor acima
        for (int i = 0; i < num_lados; i++) _lados[i] = tam_lado;
        _tipo = tipo;
    }

    // Polígono regular (numn_lados > 0)
    public Polígono(int num_lados, int tam_lado) {
        this(num_lados, tam_lado, "polígono regular"); // chama construtor acima
    }

    public static int quantosPolígonos() {
        return _no_polígonos;
    }

    // Verifica se polígonos possuem mesma unidade de medida
    public boolean éCompatívelCom(Polígono outro) {
        return _unidade.equals(outro._unidade);
    }
    public static boolean sãoCompatíveis(Polígono um, Polígono outro) {
        return um._unidade.equals(outro._unidade);
    }

    // se método não for público, não é possível chamá-lo de outra classe
    // p.ex., se alterar para private, chamada em App.java gera erro
    public int calculaPerímetro() {
        int p = 0;
        for (int lado: _lados) p += lado;
        return p;
    }

    @Override
    public String toString() {
        return "Eu sou um " + _tipo + " com " + calculaPerímetro() + _unidade + " de perímetro";
    }

}
