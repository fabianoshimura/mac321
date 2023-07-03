package aula5;

public class MP4Movie extends Movie {

    @Override  // significa que o metodo está sobrescrevendo o abstrato
    void play() {
        System.out.println("que filme legal");
    }

}