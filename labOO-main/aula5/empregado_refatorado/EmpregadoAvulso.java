package aula5.empregado_refatorado;

public class EmpregadoAvulso extends Empregado {

    private int pagamento;
    
    EmpregadoAvulso(int valor) {
        this.pagamento = valor;
    }

    @Override
    int pagamentoDoMes() {
        return pagamento;
    }

    public String toString() {
        return "sou um empregado avulso e cobrei " + pagamento;
    }
}
