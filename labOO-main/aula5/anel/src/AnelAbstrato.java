package aula5.anel.src;

public interface AnelAbstrato<T> { // classe parametrizada
    public T zero(); // representa o próprio objeto, pois pode passar para interio, racional ou boolenao
    public T um();
    public T soma(T este, T outro);
    public T produto(T este, T outro);
    public T negativo(T outro);
}