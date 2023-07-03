// Apenas um teste para entender o conceito
package aula5;

// tem que ser uma classe abstrata, pois tem pelo menos um método abstrato
public abstract class Movie {
    int duracao() {
        return 120;
    }

    abstract void play();
}
