package vendas.src;

public class VendasBr extends Vendas {
    static final double imposto = 0.8;
    static final double frete = 30;

    VendasBr(int cod, String nome, double val) {
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
