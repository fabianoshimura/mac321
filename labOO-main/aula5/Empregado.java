package aula5;
import java.util.ArrayList;

public class Empregado {

    enum TipoEmpregado {mensalista, horista, avulso};

    int salarioMensal;
    double taxaEncargosTrabalhistas;
    int pagamentoPorHora;
    int horasTrabalhadas;
    int pagamentoAvulso;

    TipoEmpregado tipo;

    public static void main(String[] args) {
        ArrayList<Empregado> corpoDeTrabalho = new ArrayList<>();

        Empregado trabalhador1 = new Empregado();
        trabalhador1.salarioMensal = 5000;
        trabalhador1.taxaEncargosTrabalhistas = 1.8;
        trabalhador1.tipo = TipoEmpregado.mensalista;
        corpoDeTrabalho.add(trabalhador1);

        Empregado trabalhador2 = new Empregado();
        trabalhador2.salarioMensal = 100;
        trabalhador2.horasTrabalhadas = 30;
        trabalhador2.tipo = TipoEmpregado.horista;
        corpoDeTrabalho.add(trabalhador2);

        Empregado trabalhador3 = new Empregado();
        trabalhador3.pagamentoAvulso = 7000;
        trabalhador3.tipo = TipoEmpregado.avulso;
        corpoDeTrabalho.add(trabalhador3);

        int custoTotal = 0;
        for(int i = 0; i < 3; i++) {
            Empregado trabalhador = corpoDeTrabalho.get(i);

            switch(corpoDeTrabalho.get(i).tipo) {
                case mensalista:
                    custoTotal += trabalhador.salarioMensal * 
                                  trabalhador.taxaEncargosTrabalhistas;
                    break;
                
                case horista:
                    custoTotal += trabalhador.pagamentoPorHora *
                                  trabalhador.horasTrabalhadas;
                    break;
                
                case avulso:
                    custoTotal += trabalhador.pagamentoAvulso;
                    break;
            }
        }

        System.out.println("Minha folha de pagamentos vai custar " + custoTotal);
    }
}
