public class Calculadora {
    /* guarda resultado da última operação relizada */
    private double resultado = 0;

    public double getResultado() {
        return resultado;
    }
   
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public double soma(double op1, double op2) {        
        resultado = op1 + op2;
        return resultado;
    }

    public double divide(double dividendo, double divisor) {        
        resultado = dividendo / divisor;
        return resultado;
    }

    @Override
    public String toString() {
        return "Resultado: " + getResultado();
    }
}