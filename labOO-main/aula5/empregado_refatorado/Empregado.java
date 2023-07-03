package aula5.empregado_refatorado;
import java.util.ArrayList;

public abstract class Empregado {

    abstract int pagamentoDoMes();

    public static void main(String[] args) {
        ArrayList<Empregado> corpoDeTrabalho = new ArrayList<>();
        
        corpoDeTrabalho.add(new EmpregadoHorista(100, 30));
        corpoDeTrabalho.add(new EmpregadoMensalista(500, 1.8));
        corpoDeTrabalho.add(new EmpregadoAvulso(7000));

        int custoTotal = 0;
        for (Empregado trabalhador: corpoDeTrabalho)
            custoTotal += trabalhador.pagamentoDoMes();
        System.out.println("Minha folha de pagamento desse mes vai custar " + custoTotal);

        System.out.println(corpoDeTrabalho); // vai imprimir o método toString (que converte aquele objeto em String) de cada elemento do Array 
    }
}
