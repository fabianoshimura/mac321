/*
 * Versão estática não pode implementar interface CalculadoraInterface,
 * pois isso obrigaria a implementação dos métodos exibeResultado e soma
 * como não estáticos. Métodos estáticos em interfaces devem ser implement-
 * ados (servem como default).
 */

public class CalculadoraStatic {
    static int resultado = 0;
    protected CalculadoraStatic() {}

    public static void exibeResultado() {
        System.out.println(resultado);
    }

    public static void soma(Integer x, Integer y) {
        resultado = x + y;
    }

    public static void main(String[] args) {
        // CalculadoraStatic calc = new CalculadoraStatic(); // gera erro. Por que?
        CalculadoraStatic.exibeResultado();
        CalculadoraStatic.soma(2,3);
        CalculadoraStatic.exibeResultado();

        System.out.println("---");

        CalculadoraStatic.exibeResultado();
        CalculadoraStatic.soma(-2,2);
        CalculadoraStatic.exibeResultado();
    }

}
