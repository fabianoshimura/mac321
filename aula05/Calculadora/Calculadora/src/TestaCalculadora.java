public class TestaCalculadora {
    public boolean testaSomaInteirosPositivos() {
        Calculadora calc = new Calculadora();
        if (calc.soma(3,4) == 7 && calc.soma(4,3) == 7) {
            return true;
        } else {
            return false;
        }
    }

    public boolean testaSomaInteirosNegativos() {
        Calculadora calc = new Calculadora();
        if (calc.soma(-3,-4) == -7 && calc.soma(-4,-3) == -7) {
            return true;
        } else {
            return false;
        }
    }

    public boolean testaSomaDecimais() {
        Calculadora calc = new Calculadora();
        if (calc.soma(0.1,0.2) == 0.3 && calc.soma(0.2,0.1) == 0.3) {
            return true;
        } else {
            return false;
        }
    }    

    public boolean testaDivisaoPorDois() {
        Calculadora calc = new Calculadora();
        if (calc.divide(7,2) == 3.5) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TestaCalculadora teste = new TestaCalculadora();
        int passou = 0;
        int nao_passou = 0;
        if (teste.testaSomaInteirosPositivos()) {
            passou += 1;
        } else {
            System.out.println("Não passou em teste de soma de inteiros positivos!");
            nao_passou += 1;
        }
        if (teste.testaSomaInteirosNegativos()) {
            passou += 1;
        } else {
            System.out.println("Não passou em teste de soma de inteiros negativos!");
            nao_passou += 1;
        }
        if (teste.testaSomaDecimais()) {
            passou += 1;
        } else {
            System.out.println("Não passou em teste de soma de decimais!");
            nao_passou += 1;
        }
        if (teste.testaDivisaoPorDois()) {
            passou += 1;
        } else {
            System.out.println("Não passou em teste de divisão por dois!");
            nao_passou += 1;
        }

        System.out.println("Sistema passou em " + passou + " de " + (passou+nao_passou) + " testes. ");
    }
}
