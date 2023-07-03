// Implementação Lazy

class CalculadoraSingletonLazy implements CalculadoraInterface<Integer> {
    private int resultado;
    private static CalculadoraSingletonLazy instância = null;

    private CalculadoraSingletonLazy() {
        resultado = 0;
    }

    public static CalculadoraSingletonLazy pegaInstância() {
        if (instância == null) {
            instância = new CalculadoraSingletonLazy();
        }
        return instância;
    }

    @Override
    public void exibeResultado() {
        System.out.println(resultado);
    }

    @Override
    public void soma(Integer x, Integer y) {
        resultado = x + y;
    }

    public static void main(String[] args) {
        // CalculadoraSingleton calc1 = new CalculadoraSingleton(); // gera erro. Por que?
        // Polimorfismo
        CalculadoraInterface<Integer> calc1 = CalculadoraSingletonLazy.pegaInstância();
        calc1.exibeResultado();
        calc1.soma(2,3);
        calc1.exibeResultado();

        System.out.println("---");

        CalculadoraInterface<Integer> calc2 = CalculadoraSingletonLazy.pegaInstância();
        calc2.exibeResultado();
        calc2.soma(-2,2);
        calc2.exibeResultado();
    }
}