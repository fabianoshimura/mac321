import java.util.ArrayList;

class Racional {
    int numerador;
    int denominador;

    // Encontra maior divisor comum entre inteiros m e n
    // pelo algoritmo de Euclides
    private static int mdc(int m, int n) {
        if (n == 0) return m;
        else return mdc(n, m % n);
    }

    Racional(int p, int q) {
        /* simplificar */
        int d = mdc(p, q);
        numerador = p / d;
        denominador = q / d;
    }

    Racional soma(Racional r) {
        return new Racional(numerador*r.denominador + r.numerador*denominador,denominador*r.denominador);
    }

    Racional produto(Racional r) {
        return new Racional(numerador*r.numerador,denominador*r.denominador);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        // Solução para lista com racionais
        ArrayList<Racional> racionais = new ArrayList();

        racionais.add(new Racional(1, 2));
        racionais.add(new Racional(1, 3));
        racionais.add(new Racional(6, 7));
        racionais.add(new Racional(1, 7));
        racionais.add(new Racional(-2, 4));
        racionais.add(new Racional(2, 4));
        racionais.add(new Racional(2, 3));
        racionais.add(new Racional(4, 3));

        // Erro de compilação:
        //Racional k = racionais.get(0) + racionais.get(1);

        for (int i=0; i < racionais.size(); i+=2) {
            Racional r = racionais.get(i);
            Racional s = racionais.get(i+1);
            Racional t = r.soma(s);
            System.out.println(r + " + " + s + " = " + t);
        }
    }    
}
