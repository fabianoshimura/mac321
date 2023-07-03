package aula5.objeto_geometrico.src;

public class Retangulo implements ObjetoGemetrico, Comparavel{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return altura*largura;
    }

    @Override
    public boolean ehMaioQue(Comparavel outro) {
        double outro_ret = ((Retangulo)outro).calculaArea();
        return (calculaArea() > outro_ret);
    }
    
}
