package sorting;

class ZeroDenominatorException extends Exception {
    public ZeroDenominatorException() {
        super("Tentativa de criar racional com denominador zero.");
    }
}