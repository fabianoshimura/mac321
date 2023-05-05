public class exercicio2{

    public static int atribuir (int valor) {
        return valor;     
    }
    
    public static int quadrado (int valor) {
        return valor*valor;
    }
    
    public static int fatorial (int valor) {
        int resultado = 1;
        
        while (valor > 0) {
            resultado *= valor;
            valor--;
        }
        
        return resultado;
    }
    
    public static void main(String []args){
        int x = 0, y = 5;
        
        x = atribuir(y);
        if (x == y) 
        	System.out.println("Valor de x = " + x + "  CORRETO!");
        
        if (quadrado(x) == x*x)
        	System.out.println("Valor do quadrado do x = " + quadrado(x) + "  CORRETO!");
        
        if (fatorial(x) == fatorial(y))
        System.out.println("Fatorial de x = " + fatorial(x) + "  CORRETO!");
    }
}