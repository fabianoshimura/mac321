package exercicio5;

public class Mamifero extends Animal {
    
    void nasce(int i) {
        System.out.println("Nasceu um mamifero: "+i);
    }

    void cresce() {
        System.out.println("Cresceu um mamifero");
    }
    
    void sangueQuente() {
        System.out.println("Sangue quente");
    }

    public static void main(String []argc) {
        Animal x = new Animal();
        x.nasce();
        Mamifero m = new Mamifero();	
        m.nasce(1);
        x.sangueQuente();     //  essa linha não é válida pois o método sangueQuente() é um método adicional da classe derivada "Mamífero", assim ele não pode ser chamado pela classe "Animal".
        x = m; // OK, pois Mamifero deriva de Animal
        x.nasce();
        x.nasce(1);         //  essa linha não é válida porque foi atribuído a "x" o objeto "m" que é da classe "Mamífero" e não possui um método "nasce" que recebe argumentos.
    }
}