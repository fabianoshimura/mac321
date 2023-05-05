package exercicio1;

public class Derivada extends Base {
	Derivada (int a) {
        super(a);
        System.out.println("Constrói Derivada");
    }
        
    public static void main(String []argc){
    	Derivada obj = new Derivada(2);
    }
}