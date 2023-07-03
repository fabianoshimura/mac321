// Implementação Eager
class CalculadoraSingletonEager implements CalculadoraInterface<Integer> {
    private int resultado;
    private static CalculadoraSingletonEager instância = new CalculadoraSingletonEager();

    private CalculadoraSingletonEager() {
        resultado = 0;
    }

    // Implementação Lazy
    public static CalculadoraSingletonEager pegaInstância() {
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
        CalculadoraInterface<Integer> calc1 = CalculadoraSingletonEager.pegaInstância();
        calc1.exibeResultado();
        calc1.soma(2,3);
        calc1.exibeResultado();

        System.out.println("---");

        CalculadoraInterface<Integer> calc2 = CalculadoraSingletonEager.pegaInstância();
        calc2.exibeResultado();
        calc2.soma(-2,2);
        calc2.exibeResultado();
    }
}