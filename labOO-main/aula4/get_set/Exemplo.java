package aula4.get_set;

public class Exemplo {
    public static void main(String[] args) {
        Veiculos caminhao = new Veiculos(6, "1000", "Scania");
        Carro carro = new Carro("Ka","Ford");
        //Moto moto = new Moto("Biz","Honda");

        Veiculos veiculos[] = {caminhao, carro};
    
        for (Veiculos v: veiculos) {
            v.detalhes();
        }
    }
    
}
