import java.util.Random;

public class TestaParamCalculadora {
    public boolean testesSomaInteira() {
        double[] entrada1 = {3, -3, 1, 0};
        double[] entrada2 = {4, -4, -1, 1};
        double[] saida = {7, -7, 0, 1};

        boolean passou;
        for (int i=0; i < entrada1.length; i++) {
            passou = testaSomaInteira(entrada1[i], entrada2[i], saida[i]);
            if (!passou) {
                return false;
            }
        }
        return true;
    }

    public boolean testaSomaInteira(double op1, double op2, double esperado) {
        Calculadora calc = new Calculadora();
        if (calc.soma(op1,op2) == esperado && calc.soma(op2,op1) == esperado) {
            return true;
        } else {
            System.out.println("Falhou em teste de soma inteira: " + op1 + " + " + op2 + " ≠ " + esperado);
            return false;
        }
    }
    
    /** Teste parametrizado aleatório de soma de inteiros
     * @param N quantidade de testes aleatórios gerados.
     * @return true se todos os testes forem bem sucedidos e false, caso contrário.
     */
    public boolean testesSomaInteiraAleatorizados(int N) {
        boolean passou;
        Random random = new Random();
        for (int i=0; i < N; i++) {
            double op1 = random.nextInt();
            double op2 = random.nextInt();
            double esperado = op1 + op2;
            passou = testaSomaInteira(op1, op2, esperado);
            if (!passou) {
                return false;
            }
        }
        return true;
    }    

    public static void main(String[] args) {
        TestaParamCalculadora teste = new TestaParamCalculadora();
        if (teste.testesSomaInteira() && teste.testesSomaInteiraAleatorizados(30)) {
            System.out.println("Sistema passou em todos os testes.");
        }
    }
}
