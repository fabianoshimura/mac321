package vendas.src;

public class VendasExterior extends Vendas {
    static final double imposto = 0.0;
    static final double frete = 100;

    VendasExterior(int cod, String nome, double val) {
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
