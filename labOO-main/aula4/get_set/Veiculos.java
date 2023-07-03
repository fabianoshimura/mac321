package aula4.get_set;

// Superclasse
public class Veiculos {
    // Variáveis privadas só podem ser acessadas pela propria classe
    private int rodas;
    private String modelo;
    private String marca;

    // Construtor - método que contem o nome da classe e inicializa ele -> instancia ele e cria
    Veiculos(int n, String mod, String mar) {
        rodas = n;
        modelo = mod;
        marca = mar;
    }

    public void detalhes() {
        System.out.println("Veiculo Modelo = " + modelo + ", marca = " + marca + " ano de fabricacao = " + rodas);
    }

    // Método de acesso para ler o objeto de fora da classe (get)/(set)
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
}