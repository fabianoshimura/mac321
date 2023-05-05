package exercicio6;

public class Homem extends Mamifero  {
    void nasce()  {
        System.out.println("Nasceu um homem");
    }

    void cresce()  {
        System.out.println("Cresceu um homem");
    }

    public static void main(String []argc) {
        Animal x = new Animal();
        x.nasce();
        Homem h = new Homem();
        h.nasce();
        h.nasce(1); // ao adicionar um parâmetro na chamada deste método, faz com que ele utilize o método 
                    // da classe "Mamifero" e não da classe "Homem", demonstrando o overloading.
        x = h;
        x.nasce();  // aqui é demoonstrado o overriding, pois é chamado um método com o mesmo nome da classe base,
                    // porém, sua saída é diferente.
    }
}
