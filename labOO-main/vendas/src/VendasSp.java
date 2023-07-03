package vendas.src;

public class VendasSp extends Vendas {
    static final double imposto = 0.12;
    static final double frete = 10;

    VendasSp(int cod, String nome, double val) {
        super(cod, nome, val);
    }

    @Override
    public double getImposto() {
        return imposto;
    }

    @Override
    public double getFrete() {
        return frete;
    }
    
}
