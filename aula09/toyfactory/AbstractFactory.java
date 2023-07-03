package toyfactory;

public interface AbstractFactory<T> {
    T create(String type) ;
}