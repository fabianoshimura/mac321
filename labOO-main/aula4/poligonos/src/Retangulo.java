package aula4.poligonos.src;

public class Retangulo extends Poligonos {

    public Retangulo(int lado) { // cria quadrado
        super(4, lado, "quadrado");
        //_tipo = "quadrado"; // gera erro se _tipo for private 
    }    

    public Retangulo(int largura, int altura) {
        super(new int[4], "retângulo");
        // gera erro se _lados for private
        _lados[0] = _lados[2] = largura;
        _lados[1] = _lados[3] = altura;
        //_tipo = "retângulo"; // gera erro se _tipo for private 
    }

    public double calculaÁrea() {
        return pegaLargura()*pegaAltura();
    }

    public double calculaPerimetro() {
        return 2*pegaAltura() + 2*pegaLargura();
    }

    public int pegaLargura() { return _lados[0]; }
    public int pegaAltura() { return _lados[1]; }
}
