/*
 * Versão estática não pode implementar interface CalculadoraInterface,
 * pois isso obrigaria a implementação dos métodos exibeResultado e soma
 * como não estáticos. Métodos estáticos em interfaces devem ser implement-
 * ados (servem como default).
 */

public class CalculadoraStaticSub extends CalculadoraStatic {
    static int resultado = 0;
    private CalculadoraStaticSub() {}

    public static void exibeResultado() {
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        CalculadoraStatic.soma(2,3);
        CalculadoraStaticSub.soma(2,3); // altera var resultado da classe pai

        CalculadoraStatic.exibeResultado();
        CalculadoraStaticSub.exibeResultado();

        System.out.println("---");

        CalculadoraStatic calc = new CalculadoraStaticSub();
        calc.soma(2,3);
        calc.exibeResultado(); // não assume forma de StaticSub (polimorfismo)
    }

}
