package aula5.objeto_geometrico.src;

public class Circulo extends ObjetoSemCanto implements ObjetoGemetrico, Comparavel{
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI*raio*raio;
    }

    @Override
    public boolean ehMaioQue(Comparavel outro) {
        Double areaOutro = ((Circulo)outro).calculaArea();
        return (calculaArea() > areaOutro);
    }
    
}
    

