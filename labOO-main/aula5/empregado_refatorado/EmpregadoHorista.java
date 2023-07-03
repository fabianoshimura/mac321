package aula5.empregado_refatorado;

public class EmpregadoHorista extends Empregado{

    private int salarioPorHora;
    private int horasTrabalhadas;

    EmpregadoHorista(int salPorHora, int horasTrba) {
        this.salarioPorHora = salPorHora;
        this.horasTrabalhadas = horasTrba;
    }

    @Override
    int pagamentoDoMes() {
        return salarioPorHora*horasTrabalhadas;
    } 

    public String toString() {
        return "sou um empregado horista, ganho " + salarioPorHora + " e trabalhei " + horasTrabalhadas;
    }
}
