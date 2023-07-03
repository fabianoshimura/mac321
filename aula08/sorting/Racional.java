package sorting;

import java.util.ArrayList;

class Racional implements Comparable<Racional> {
    private int numerador;
    private int denominador;

    public int getNumerador() {
        return numerador;
    }
        public int getDenominador() {
        return denominador;
    }

    // Encontra maior divisor comum entre inteiros m e n
    // pelo algoritmo de Euclides
    private static int mdc(int m, int n) {
        if (n == 0) return m;
        else return mdc(n, m % n);
    }

    /* Cria racional p/q */
    Racional(int numerador, int denominador) throws ZeroDenominatorException {
        /* denominador precisa ser diferente de zero */
        if (denominador == 0)
            throw new ZeroDenominatorException();
        /* simplificar */
        if (numerador == 0) {
            this.numerador = numerador;
            this.denominador = 1;
        } else {
         int d = mdc(numerador, denominador);
         this.numerador = numerador / d;
         this.denominador = denominador / d;
        }
    }

    Racional(int numerador) throws ZeroDenominatorException {
        this(numerador, 1);
    }

    /* Calcula a soma desse racional e de outro dado */
    Racional soma(Racional r) throws ZeroDenominatorException { 
        return new Racional(numerador*r.denominador + r.numerador*denominador,denominador*r.denominador);
    }

    /*
     * Calcula o produto desse racional e outro dado
     */
    Racional produto(Racional r) throws ZeroDenominatorException {
        return new Racional(numerador*r.numerador,denominador*r.denominador);
    }

    /*
     * Calcula o recíproco desse número racional (isto é, q/p para um racional p/q)
     */
    Racional recíproco() throws ZeroDenominatorException {
        if (this.numerador == 0) {
            throw new ZeroDenominatorException();
        }
        return new Racional(denominador,numerador);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public int compareTo(Racional outro) {
        if (this.numerador * outro.denominador < outro.numerador * this.denominador)
          return -1;
        else 
          if (this.numerador * outro.denominador > outro.numerador * this.denominador)
            return 1;
        else return 0;
    }       

    public static void main(String[] args) {
        // Solução para lista com racionais
        ArrayList<Racional> racionais = new ArrayList<>();

        try {

            racionais.add(new Racional(1, 2));
            racionais.add(new Racional(1, 3));
            racionais.add(new Racional(6, 7));
            racionais.add(new Racional(1, 7));
            racionais.add(new Racional(-2, 4));
            racionais.add(new Racional(2, 4));
            racionais.add(new Racional(2, 3));
            racionais.add(new Racional(4, 3));

            for (int i=0; i < racionais.size(); i+=2) {
                // Tente primeiro executar sem o bloco try-catch
                    Racional r = racionais.get(i);
                    Racional s = racionais.get(i+1);
                    Racional t = r.soma(s);
                    System.out.println("t = " + r + " + " + s + " = " + t);
                    // Gera exceção se número t for zero:
                    try {
                        Racional recíproco_t = t.recíproco();
                        System.out.println("1/t = " + recíproco_t);
                     } catch (ZeroDenominatorException e) {
                        System.out.println("Tentativa de inverter racional zero: " + t);                        
                     }
             }
        } catch (ZeroDenominatorException e) {
            System.out.println(e);
        } catch (Exception e) {
             e.printStackTrace();                
        }
    }
 
}

