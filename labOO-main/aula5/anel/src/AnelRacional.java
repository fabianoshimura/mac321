package aula5.anel.src;

public class AnelRacional implements AnelAbstrato<Racional> {

    @Override
    public Racional zero() {
        return new Racional(0,1);
    }

    @Override
    public Racional um() {
        return new Racional(1,1);
    }

    @Override
    public Racional soma(Racional este, Racional outro) {
        return este.soma(outro);
    }

    @Override
    public Racional produto(Racional este, Racional outro) {
        return este.produto(outro);
        
    }

    @Override
    public Racional negativo(Racional outro) {
        return outro.negativo(outro);
    }
    
}
