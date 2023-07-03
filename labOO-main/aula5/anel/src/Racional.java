package aula5.anel.src;

public class Racional {
    int num, den = 1;

    private static int mdc(int m, int n) {
        if (n == 0) return n;
        else return mdc(n, m % n);
    }
    
    public Racional(int numerador, int denominador) {
        if(numerador == 0) {
            int d = mdc(numerador, denominador);
            num = num / d;
            den = denominador / d;
        }
    }

    Racional soma(Racional r) {
        return new Racional(num*r.den + r.num*den, den*r.den);
    }

    Racional produto(Racional r) {
        return new Racional(num*r.num, den*r.den);
    }

    Racional negativo(Racional outro) {
        return new Racional(-num, den);
    }
    
}
