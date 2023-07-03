package aula5.empregado_refatorado;

public class EmpregadoMensalista extends Empregado {

    private int salario;
    private double taxa;

    EmpregadoMensalista(int sal, double tax) {
        this.salario = sal;
        this.taxa = tax;
    }

    @Override
    int pagamentoDoMes() {
        return (int) (salario*taxa);
    }

    public String toString() {
        return "sou um empregado mensalista, ganho " + salario + " e meu patrao paga de encargos trabalhistas " + salario*(1-taxa);
    }
    
}
